package com.java.patterns.memento;

public class RemoteRepository {

    private Snapshot snapshot;


    public Snapshot getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(Snapshot snapshot) {
       this.snapshot = snapshot;
    }
}
