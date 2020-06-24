package com.example.android.quakereport;

public class Earthquake {

    private Double magnitude;
    private String location;
    private Long timeInMs;

    public Earthquake(Double magnitude, String location, Long timeInMs) {
        this.magnitude = magnitude;
        this.location = location;
        this.timeInMs = timeInMs;
    }

    public Double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public Long getTimeInMs() {
        return timeInMs;
    }

    @Override
    public String toString() {
        return "Earthquake{" +
                "magnitude='" + magnitude + '\'' +
                ", location='" + location + '\'' +
                ", timeInMs=" + timeInMs +
                '}';
    }
}


