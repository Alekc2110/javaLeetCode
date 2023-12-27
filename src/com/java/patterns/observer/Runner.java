package com.java.patterns.observer;

/**
 * implementation of push-pull observer model, with addition coupling
 * for Observers with a constructor of Observable that also implement State interface
 * for the Observers to be able to retrieve concrete state of data that they need
 */
public class Runner {
    public static void main(String[] args) {
        WeatherServer weatherServer = new WeatherServer("WeatherServer1");
        Observer smartphone = new Smartphone(weatherServer);
        Observer module = new DisplayModule(weatherServer);
        weatherServer.add(smartphone, module);


        weatherServer.setSensor1(10);
        weatherServer.setSensor2(21);
        weatherServer.setSensor1(42);

        System.out.println("clients state before notification:\n");
        System.out.println(smartphone);
        System.out.println(module);
        System.out.println();

        weatherServer.notifyClient();
        System.out.println("clients state after notification:\n");
        System.out.println(smartphone);
        System.out.println(module);
        System.out.println();


    }
}
