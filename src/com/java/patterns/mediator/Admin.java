package com.java.patterns.mediator;

public class Admin extends AbstractUser{

    public Admin(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void readMessage(String message) {
        System.out.println("Администратор " + getName() + " получает сообщение: " + message + "\n");
    }
}
