package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    public void sendMessageTopic1(Order order) {
        kafkaTemplate.send("topic1", order);
    }

    public void sendMessageTopic2(Order order) {
        kafkaTemplate.send("topic2", order);
    }

}