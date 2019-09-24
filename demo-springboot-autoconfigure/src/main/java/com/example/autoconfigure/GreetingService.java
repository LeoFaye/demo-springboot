package com.example.autoconfigure;


public class GreetingService {

    GreetingProperties greetingProperties;

    public void setGreetingProperties(GreetingProperties greetingProperties) {
        this.greetingProperties = greetingProperties;
    }

    public String hello(String name) {
        return greetingProperties.getPrefix() + name;
    }
}
