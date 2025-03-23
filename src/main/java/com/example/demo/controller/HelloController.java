package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.messaging.MyEventMessage;
import com.example.demo.producer.KafkaProducer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@Slf4j
public class HelloController {
    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/send/{message}")
    public String getMethodName(@PathVariable(name = "message") String message) {
        
        log.info("Sending message to topic!");
        
        MyEventMessage event = new MyEventMessage();
        event.setKey(message);
        

        kafkaProducer.sendFlightEvent(event);
        log.info("Message Sent to topic!");
        
        return "Your message '" + message + "' has been sent successfully!";
    }
  }
    


