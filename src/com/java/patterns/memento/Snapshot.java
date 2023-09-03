package com.java.patterns.memento;

import java.time.LocalDate;

public record Snapshot(String version, LocalDate date) implements Memento {
}
