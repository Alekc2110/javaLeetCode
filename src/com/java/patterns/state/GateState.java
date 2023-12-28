package com.java.patterns.state;

public interface GateState {
    void enter();
    void pay();
    void payOk();
    void payFailed();
    StateStatus getCurrentStatus();
}
