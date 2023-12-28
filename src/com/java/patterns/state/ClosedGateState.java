package com.java.patterns.state;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class ClosedGateState implements GateState{
    private final ElectronicGate gate;
    private final StateStatus status = StateStatus.CLOSED;
    @Override
    public void enter() {
        System.out.println("Don`t let person enter the gate, because it`s in closed state");
        this.gate.changeState(new ClosedGateState(this.gate));
    }

    @Override
    public void pay() {
        System.out.println("let person pay the gate, initialize payment");
        this.gate.changeState(new PaymentProcessingGateState(this.gate));
    }

    @Override
    public void payOk() {
        System.out.println("payment passed, change state to open");
        this.gate.changeState(new OpenGateState(this.gate));
    }

    @Override
    public void payFailed() {
        System.out.println("payment didn`t pass");
        this.gate.changeState(new ClosedGateState(this.gate));
    }

    @Override
    public StateStatus getCurrentStatus() {
        return status;
    }
}
