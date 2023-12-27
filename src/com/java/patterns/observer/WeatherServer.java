package com.java.patterns.observer;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class WeatherServer extends AbstractServer {

    private int sensor1;
    private int sensor2;
    private int sensor3;

    public WeatherServer(String name) {
        super(name);
    }

    /**
     * some business logic of concrete Observable
     * @return int -> average temperature level
     */
    private int getTemperature() {
        return (sensor1 + sensor2 + sensor3) / 3;
    }

    @Override
    public int getState() {
        return getTemperature();
    }
}
