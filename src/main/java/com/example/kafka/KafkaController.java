package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaProducerService producerService;

    @PostMapping("/send-to-topic1")
    public String sendOrderTopic1(@RequestBody Order order) {
        producerService.sendMessageTopic1(order);
        return "Order sent to topic 1!";
    }

    @PostMapping("/send-to-topic2")
    public String sendOrderTopic2(@RequestBody Order order) {
        producerService.sendMessageTopic2(order);
        return "Order sent to topic 2!";
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Kafka service is running!";
    }

    // scheduled task to send a test order every 5 seconds
    @Scheduled(fixedRate = 5000)
    public void sendOrder() {
        Order order = new Order();
        order.setOrderId(1);
        order.setProductName("Product-" + order.getOrderId());
        producerService.sendMessageTopic1(order);
    }
}