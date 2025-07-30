package com.example.kafka;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Order {
    Integer orderId;
    String productName;
}