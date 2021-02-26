package com.springboot.model;

import lombok.Data;

@Data
public class PaymentRequest {
    private Long amount;
    private String paymentMethod;
}
