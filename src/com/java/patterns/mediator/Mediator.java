package com.java.patterns.mediator;

public interface Mediator {
    void sendMessage(String message, Client client);
}
