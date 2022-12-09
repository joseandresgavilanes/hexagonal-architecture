package com.example.demo.infraestructure.configuration;

import com.example.demo.AplicationDddApplication;
import com.example.demo.domain.repository.OrderRepository;
import com.example.demo.domain.service.DomainOrderService;
import com.example.demo.domain.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = AplicationDddApplication.class)
public class BeanConfiguration {

    @Bean
    OrderService orderService(final OrderRepository orderRepository) {
        return new DomainOrderService(orderRepository);
    }
}
