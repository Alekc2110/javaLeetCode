package com.java.patterns.observer;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public abstract class AbstractServer implements Observable {

    private final List<Observer> clientList = new ArrayList<>();
    private String name;


    public AbstractServer(String name) {
        this.name = name;
    }

    @Override
    public boolean add(Observer... clients) {
        return clientList.addAll(List.of(clients));
    }

    @Override
    public void remove(Observer client) {
        clientList.remove(client);
    }

    @Override
    public void notifyClient() {
        for (Observer client : clientList) {
            client.update();
        }
    }
}
