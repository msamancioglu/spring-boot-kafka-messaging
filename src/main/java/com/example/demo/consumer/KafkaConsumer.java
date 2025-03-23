package com.example.demo.consumer;

import lombok.extern.slf4j.Slf4j;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.example.demo.messaging.MyEventMessage;


@Slf4j
@Component
public class KafkaConsumer {
    public static final String TOPIC= "hello-world-topic";
    
    @KafkaListener(topics = TOPIC, groupId = "hello-world-group")
    public void flightEventConsumer(MyEventMessage message) {
        log.info("Consumer consume Object -> {}", message);
        log.info("Consumer access message.key field value : {}", message.getKey());
        // write your handlers and post-processing logic, based on your use case
    }
}