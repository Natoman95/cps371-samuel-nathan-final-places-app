package com.app.places.placesapp;

/**
 * Stores information about a place retrieved from Google's Places API
 */
public class Place {

    private String name;
    private double rating;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public String getAddress() {
        return address;
    }
}
