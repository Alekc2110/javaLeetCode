package com.java.patterns.mediator;

public class Runner {
    public static void main(String[] args) {
        Chat chat = new Chat("text-chat");
        AbstractUser admin = new Admin(chat, "Admin");
        AbstractUser user1 = new User(chat, "Ivan");
        user1.setEnabled(false);
        AbstractUser user2 = new User(chat, "Diana");
        AbstractUser user3 = new User(chat, "John");

        chat.setAdmin(admin);
        chat.addUser(user1, user2, user3);

        admin.sendMessage("Hello everyone from Admin");
        user2.sendMessage("Nice to meet you. It`s Diana");
    }
}
