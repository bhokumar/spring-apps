package org.iot.apps.beans;

import org.apache.commons.net.ftp.FTPFile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.file.filters.AcceptOnceFileListFilter;
import org.springframework.integration.file.remote.session.CachingSessionFactory;
import org.springframework.integration.file.remote.session.SessionFactory;
import org.springframework.integration.ftp.filters.FtpSimplePatternFileListFilter;
import org.springframework.integration.ftp.inbound.FtpInboundFileSynchronizer;
import org.springframework.integration.ftp.inbound.FtpInboundFileSynchronizingMessageSource;
import org.springframework.integration.ftp.session.DefaultFtpSessionFactory;
import org.springframework.messaging.MessageHandler;

import java.io.File;

@Configuration
public class Beans {



    @Bean
    public SessionFactory<FTPFile> getDefaultSessionFactory(){
        DefaultFtpSessionFactory defaultFtpSessionFactory = new DefaultFtpSessionFactory();
        defaultFtpSessionFactory.setHost("localhost");
        defaultFtpSessionFactory.setPort(21);
        defaultFtpSessionFactory.setUsername("BHOOPENDRA");
        defaultFtpSessionFactory.setPassword("RATHORE");
        defaultFtpSessionFactory.setClientMode(0);
        defaultFtpSessionFactory.setFileType(2);
        defaultFtpSessionFactory.setBufferSize(10000);
        return new CachingSessionFactory<FTPFile>(defaultFtpSessionFactory);
    }



    @Bean
    public FtpInboundFileSynchronizer ftpInboundFileSynchronizer(){
        FtpInboundFileSynchronizer ftpInboundFileSynchronizer = new FtpInboundFileSynchronizer(getDefaultSessionFactory());
        ftpInboundFileSynchronizer.setDeleteRemoteFiles(true);
        ftpInboundFileSynchronizer.setRemoteDirectory("ftp_files");
        ftpInboundFileSynchronizer.setFilter(new FtpSimplePatternFileListFilter("*.*"));
        return ftpInboundFileSynchronizer;
    }

    @Bean
    @InboundChannelAdapter(channel = "ftpChannel", poller = @Poller(fixedDelay = "5000"))
    public MessageSource<File> ftpMessageSource(){
        FtpInboundFileSynchronizingMessageSource messageSource = new FtpInboundFileSynchronizingMessageSource(ftpInboundFileSynchronizer());
        messageSource.setLocalDirectory(new File("ftp_files"));
        messageSource.setAutoCreateLocalDirectory(true);
        messageSource.setLocalFilter(new AcceptOnceFileListFilter<File>());
        return messageSource;
    }

    @Bean
    @ServiceActivator(inputChannel = "ftpChannel")
    public MessageHandler handler(){
        MessageHandler messageHandler = (message)-> System.out.println("Handling payload"+message.getPayload());
        return messageHandler;
    }

}
