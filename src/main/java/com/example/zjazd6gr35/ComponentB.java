package com.example.zjazd6gr35;

import org.springframework.stereotype.Component;

@Component(value = "test")
public class ComponentB {

    public void printName(){
        System.out.println("Nazwa komponentu: " + this.getClass().getSimpleName());
    }
}
