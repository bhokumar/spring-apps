package spring.scoolspring;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

import org.school.spring.bean.Triangle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
       Triangle triangle = (Triangle)factory.getBean("triangle");
       System.out.println("########################################################");
       triangle.draw();
       System.out.println("########################################################");
       
    }
}