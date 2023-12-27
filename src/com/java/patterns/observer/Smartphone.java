package com.java.patterns.observer;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Accessors
@RequiredArgsConstructor
@ToString(exclude = {"server"})
public class Smartphone implements Observer{
    private Observable server;
    private String name;
    private int currentTemperature;


    public Smartphone(Observable server) {
        this.server = server;
        this.name = "Smartphone";
    }

    @Override
    public void update() {
       this.currentTemperature =  server.getState();
    }
}
