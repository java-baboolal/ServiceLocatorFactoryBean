package com.springboot.config;

import com.springboot.registry.PaymentService;
import com.springboot.registry.PaymentServiceLocator;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springboot.registry.ServiceRegistry;

@Configuration
public class VehicleConfig {

	@Bean
	public FactoryBean<?> factoryBean() {
		final ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
		bean.setServiceLocatorInterface(PaymentServiceLocator.class);
		return bean;
	}

}
