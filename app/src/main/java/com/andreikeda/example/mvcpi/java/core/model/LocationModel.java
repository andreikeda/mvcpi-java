package com.andreikeda.example.mvcpi.java.core.model;

public class LocationModel {
    private String name;
    private String region;
    private String country;
    private double lat;
    private double lon;
    private String tzId;
    private String localtime;

    public String getCountry() {
        return country;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getLocaltime() {
        return localtime;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getTzId() {
        return tzId;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setLat(final double lat) {
        this.lat = lat;
    }

    public void setLon(final double lon) {
        this.lon = lon;
    }

    public void setLocaltime(final String localtime) {
        this.localtime = localtime;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setRegion(final String region) {
        this.region = region;
    }

    public void setTzId(final String tzId) {
        this.tzId = tzId;
    }
}
