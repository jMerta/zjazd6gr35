package com.example.zjazd6gr35;

import org.springframework.stereotype.Component;

@Component
public class ComponentA {

    public void printName(){
        System.out.println("Nazwa komponentu: " + this.getClass().getSimpleName());
    }
}
