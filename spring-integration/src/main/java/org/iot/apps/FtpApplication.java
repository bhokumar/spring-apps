package org.iot.apps;

import org.apache.commons.net.ftp.FTPFile;
import org.iot.apps.controller.HelloWorldRestController;
import org.iot.apps.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.core.Pollers;
import org.springframework.integration.dsl.ftp.FtpInboundChannelAdapterSpec;
import org.springframework.integration.file.remote.session.SessionFactory;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;

import java.io.File;

@SpringBootApplication
public class FtpApplication {
    @Autowired
    SessionFactory<FTPFile> ftpSessionFactory;

    public static void main(String[] args){
        SpringApplication.run(FtpApplication.class);

        Message<String> message = MessageBuilder.withPayload("hello").build();
        Message<String> message1 = new GenericMessage<>("message");

    }

   /* @Bean
    public IntegrationFlow ftpinboundFlow(){
        return IntegrationFlows
                .from(s -> s.ftp(this.ftpSessionFactory)
                                .preserveTimestamp(true)
                                .remoteDirectory("foo")
                                .regexFilter(".*\\.txt$")
                                .localFilename(f -> f.toUpperCase() + ".a")
                                .localDirectory(new File("d:\\ftp_files")),
                        e -> e.id("ftpInboundAdapter")
                                .autoStartup(true)
                                .poller(Pollers.fixedDelay(5000)))
                .handle(m -> System.out.println(m.getPayload()))
                .get();
    }*/
}
