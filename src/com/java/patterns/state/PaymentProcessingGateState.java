package com.java.patterns.state;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class PaymentProcessingGateState implements GateState{
    private ElectronicGate gate;
    private final StateStatus status = StateStatus.PROCESSING;
    @Override
    public void enter() {
        System.out.println("person should wait while payment is in process");
    }

    @Override
    public void pay() {
        System.out.println("payment processing is ongoing");
    }

    @Override
    public void payOk() {
        System.out.println("payment processing succeed");
        this.gate.changeState(new OpenGateState(this.gate));
    }

    @Override
    public void payFailed() {
        System.out.println("payment processing hasn`t succeed");
        this.gate.changeState(new ClosedGateState(this.gate));
    }

    @Override
    public StateStatus getCurrentStatus() {
        return status;
    }
}
