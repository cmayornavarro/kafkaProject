package com.kafka.springboot.connectors;
import org.slf4j.Logger;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.logging.log4j2.Log4J2LoggingSystem;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
    public class KafkaReceiver {

        @KafkaListener(topics = "someTopic")
        public void processMessage(String content) {
           System.out.println("Message receive from kafka: "+ content);

        }

    }
