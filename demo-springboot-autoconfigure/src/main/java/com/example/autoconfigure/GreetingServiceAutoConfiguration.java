package com.example.autoconfigure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(GreetingProperties.class)
public class GreetingServiceAutoConfiguration {

    @Autowired
    GreetingProperties greetingProperties;

    @Bean
    public GreetingService greetingService() {
        GreetingService service = new GreetingService();
        service.setGreetingProperties(greetingProperties);
        return service;
    }
}
