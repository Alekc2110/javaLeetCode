package com.java.patterns.state;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class ElectronicGate {

    private GateState state;

    public ElectronicGate() {
        this.state = new ClosedGateState(this);
        System.out.println("set initial gateState as " + state.getCurrentStatus());
    }

    public void enter() {
        this.state.enter();
    }

    public void pay() {
       this.state.pay();
    }

    public void payOk() {
      this.state.payOk();
    }

    public void payFailed() {
       this.state.payFailed();
    }

    public void changeState(GateState state) {
        this.state = state;
    }
}
