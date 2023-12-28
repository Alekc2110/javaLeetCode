package com.java.patterns.state;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class OpenGateState implements GateState{

    private final ElectronicGate gate;
    private final StateStatus status = StateStatus.OPEN;
    @Override
    public void enter() {
        System.out.println("let person enter the gate");
        this.gate.changeState(new ClosedGateState(this.gate));
    }

    @Override
    public void pay() {
        System.out.println("person initiate payment processing");
        this.gate.changeState(new PaymentProcessingGateState(this.gate));
    }

    @Override
    public void payOk() {
        System.out.println("allow the person to enter the gate");
        this.gate.changeState(new OpenGateState(this.gate));
    }

    @Override
    public void payFailed() {
        System.out.println("deny the person to enter the gate");
        this.gate.changeState(new ClosedGateState(this.gate));
    }

    @Override
    public StateStatus getCurrentStatus() {
        return status;
    }
}
