package org.smartapps.jms.jmsclient.listeners;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsConsumer {

    @JmsListener(destination = "standalone.queue")
    public void consume(String message){
        System.out.println("Received messages : "+message);
    }
}
