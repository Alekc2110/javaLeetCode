package com.java.patterns.memento;

import java.time.LocalDate;

public class Project {
    private String version;
    private LocalDate date;


    public Snapshot saveSnapshot() {
        return new Snapshot(version, date);
    }

    public void setCurrentVersion(String version, LocalDate date) {
        this.version = version;
        this.date = date;
    }

    public void restorePreviousSnapshot(Snapshot snapshot) {
        this.version = snapshot.version();
        this.date = snapshot.date();
    }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", date=" + date +
                "}\n";
    }
}
