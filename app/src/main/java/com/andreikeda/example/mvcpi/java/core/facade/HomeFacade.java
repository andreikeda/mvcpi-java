package com.andreikeda.example.mvcpi.java.core.facade;

public class HomeFacade {
    private String lat;
    private String lng;

    public void setLat(final String lat) {
        this.lat = lat;
    }

    public void setLng(final String lng) {
        this.lng = lng;
    }

    public String getCoordinates() {
        return lat + "," + lng;
    }
}
