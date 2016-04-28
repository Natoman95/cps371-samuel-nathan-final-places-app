package com.app.places.placesapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Stores information about a place retrieved from Google's Places API
 */
public class Place implements Parcelable {

    private String name;
    private double rating;
    private String address;

    public Place() {}

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

    protected Place(Parcel in) {
        name = in.readString();
        rating = in.readDouble();
        address = in.readString();
    }

    public static final Creator<Place> CREATOR = new Creator<Place>() {
        @Override
        public Place createFromParcel(Parcel in) {
            return new Place(in);
        }

        @Override
        public Place[] newArray(int size) {
            return new Place[size];
        }
    };

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeDouble(rating);
        dest.writeString(address);
    }
}
