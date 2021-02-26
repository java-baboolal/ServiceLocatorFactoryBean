package com.springboot.registry;


public interface PaymentServiceLocator {
    PaymentService getAwesomeService(String bean);
}
