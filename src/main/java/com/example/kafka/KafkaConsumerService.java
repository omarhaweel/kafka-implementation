package com.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "topic1", groupId = "my-group")
    public void listen(Order order) {
        System.out.println("Received Order: " + order);
    }

    @KafkaListener(topics = "topic2", groupId = "my-group")
    public void listen2(Order order) {
        System.out.println("Received Order from topic2: " + order);
    }


}