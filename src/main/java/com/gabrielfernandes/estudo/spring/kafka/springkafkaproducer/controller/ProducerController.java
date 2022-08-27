package com.gabrielfernandes.estudo.spring.kafka.springkafkaproducer.controller;

import com.gabrielfernandes.estudo.spring.kafka.springkafkaproducer.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    @Autowired
    private KafkaProducer kafkaProducer;

    @GetMapping("/producer/sendMessage")
    public @ResponseBody String produceMessage(@RequestParam String message) {
        kafkaProducer.sendMessage(message);

        return "true";
    }
}
