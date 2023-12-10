package com.example.zjazd6gr35;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component(value = "test")
public class ComponentB {

    private final ComponentA componentA;

    public ComponentB(ComponentA componentA) {
        this.componentA = componentA;
    }

    public void printName(){
        System.out.println("Nazwa komponentu: " + this.getClass().getSimpleName());
        System.out.println("Nazwa zależności: " + componentA.getClass().getSimpleName());
        componentA.printName();
    }
}
