package com.example.zjazd6gr35;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Zjazd6gr35Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Zjazd6gr35Application.class, args);

        ComponentA componentA = context.getBean("componentA", ComponentA.class);
        ComponentB componentB = context.getBean("test", ComponentB.class);
        componentA.printName();
        componentB.printName();
    }

}
