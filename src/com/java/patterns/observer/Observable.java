package com.java.patterns.observer;

public interface Observable extends State{

   boolean add(Observer... client);
   void remove(Observer client);
   void notifyClient();
}
