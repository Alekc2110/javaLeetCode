package com.java.patterns.memento;

import java.time.LocalDate;

public interface Memento {
    String version();
    LocalDate date();
}
