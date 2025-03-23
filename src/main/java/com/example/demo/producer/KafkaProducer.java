package com.example.demo.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.messaging.MyEventMessage;

@Slf4j
@Component
@RequiredArgsConstructor
public class KafkaProducer {
    public static final String TOPIC= "hello-world-topic";

    private final KafkaTemplate<String, MyEventMessage> kafkaTemplate;

    public void sendFlightEvent(MyEventMessage event){
        String key = event.getKey();
        kafkaTemplate.send(TOPIC, key , event);
        log.info(kafkaTemplate.toString());
        log.info("Message sent successfully");
    }
        
}