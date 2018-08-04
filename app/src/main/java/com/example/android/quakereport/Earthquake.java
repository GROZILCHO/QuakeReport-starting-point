package com.example.android.quakereport;

public class Earthquake {
    private double magnitude;
    private String location;
    private long timeInMilliseconds;
    private String url;

    /**
     * Construct a {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size )of the earthquake
     * @param  location is the city location for the earthquake
     * @param timeInMilliseconds is the date the earthquake happened
     * **/
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        this.magnitude = magnitude;
        this.location = location;
        this.timeInMilliseconds = timeInMilliseconds;
        this.url = url;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }

    public String getUrl() {
        return url;
    }
}
