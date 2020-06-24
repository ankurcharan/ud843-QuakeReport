package com.example.android.quakereport;

public class Earthquake {

    private Double magnitude;
    private String location;
    private Long timeInMs;
    private String url;

    public Earthquake(Double magnitude, String location, Long timeInMs, String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.timeInMs = timeInMs;
        this.url = url;
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

    public String getUrl() {
        return url;
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


