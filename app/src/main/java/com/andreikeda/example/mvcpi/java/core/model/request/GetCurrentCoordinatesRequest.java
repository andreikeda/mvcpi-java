package com.andreikeda.example.mvcpi.java.core.model.request;

import androidx.annotation.NonNull;

public class GetCurrentCoordinatesRequest {
    private double lat;
    private double lng;

    public double getLat() {
        return lat;
    }

    public void setLat(final double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(final double lng) {
        this.lng = lng;
    }

    @NonNull
    @Override
    public String toString() {
        return getLat() + "," + getLng();
    }
}
