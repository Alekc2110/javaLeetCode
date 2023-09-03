package com.java.patterns.mediator;

public interface Client {
    void sendMessage(String message);
    void readMessage(String message);
    boolean isEnabled();
}
