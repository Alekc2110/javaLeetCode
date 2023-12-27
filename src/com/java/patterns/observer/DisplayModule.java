package com.java.patterns.observer;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Accessors
@RequiredArgsConstructor
@ToString(exclude = {"server"})
public class DisplayModule implements Observer{
    private Observable server;
    private String name;
    private int currentTemperature;

    public DisplayModule(Observable server) {
        this.server = server;
        this.name = "DisplayModule";
    }

    @Override
    public void update() {
        this.currentTemperature =  server.getState();
    }
}
