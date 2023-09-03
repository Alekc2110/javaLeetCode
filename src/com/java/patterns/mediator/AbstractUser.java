package com.java.patterns.mediator;

import java.util.Objects;

public abstract class AbstractUser implements Client {

    private final Chat chat;
    private final String name;
    private boolean isEnabled;

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public AbstractUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
        this.isEnabled = true;
    }

    public String getName() {
        return name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void readMessage(String message) {
        System.out.println("Пользователь " + getName() + " получает сообщение: " + message + " в чате: " + chat + "\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractUser that = (AbstractUser) o;
        return isEnabled == that.isEnabled && chat.equals(that.chat) && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chat, name, isEnabled);
    }
}
