package com.java.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements Mediator {
    private Client admin;
    private final String chatName;
    private final List<Client> clients = new ArrayList<>();

    public Chat(String chatName) {
        this.chatName = chatName;
    }

    public void setAdmin(Client admin) {
        if (admin instanceof Admin) {
            this.admin = admin;
        } else {
            throw new RuntimeException("simple user may not be assigned as administrator!");
        }

    }

    public void addUser(Client... users) {
        clients.addAll(List.of(users));
    }

    @Override
    public void sendMessage(String message, Client client) {
        admin.readMessage(message);
        for (Client c : clients) {
            if (client instanceof Admin) {
                c.readMessage(message);
            } else if (!c.equals(client) && c.isEnabled()) {
                c.readMessage(message);
            }
        }
    }

    @Override
    public String toString() {
        return "Chat{chatName= " + chatName + "}";
    }
}
