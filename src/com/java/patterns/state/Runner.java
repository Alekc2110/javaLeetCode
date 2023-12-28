package com.java.patterns.state;

public class Runner {
    public static void main(String[] args) {

        ElectronicGate electronicGate = new ElectronicGate();

        System.out.println("person trying to pass the closed gate");
        electronicGate.enter();
        System.out.println("current gate status: " + electronicGate.getState().getCurrentStatus() + "\n");

        System.out.println("person initialize payment process");
        electronicGate.pay();
        System.out.println("current gate status: " + electronicGate.getState().getCurrentStatus());
        electronicGate.payOk();
//        electronicGate.payFailed();
        System.out.println("current gate status: " + electronicGate.getState().getCurrentStatus() + "\n");

        electronicGate.enter();
        System.out.println("current gate status: " + electronicGate.getState().getCurrentStatus());





    }
}
