package com.andreikeda.example.mvcpi.java.core.model;

public class CurrentModel {
    private String lastUpdateAt;
    private double feelsLikeC;
    private double feelsLikeF;
    private double gustMPH;
    private double gustKPH;
    private double tempC;
    private double tempF;
    private double uv;
    private double windMPH;
    private double windKPH;
    private int humidity;
    private int windDegree;
    private char windDir;
    private boolean isDay;
    private ConditionModel condition;

    public String getLastUpdateAt() {
        return lastUpdateAt;
    }

    public void setLastUpdateAt(final String lastUpdateAt) {
        this.lastUpdateAt = lastUpdateAt;
    }

    public double getFeelsLikeC() {
        return feelsLikeC;
    }

    public void setFeelsLikeC(final double feelsLikeC) {
        this.feelsLikeC = feelsLikeC;
    }

    public double getFeelsLikeF() {
        return feelsLikeF;
    }

    public void setFeelsLikeF(final double feelsLikeF) {
        this.feelsLikeF = feelsLikeF;
    }

    public double getGustMPH() {
        return gustMPH;
    }

    public void setGustMPH(final double gustMPH) {
        this.gustMPH = gustMPH;
    }

    public double getGustKPH() {
        return gustKPH;
    }

    public void setGustKPH(final double gustKPH) {
        this.gustKPH = gustKPH;
    }

    public double getTempC() {
        return tempC;
    }

    public void setTempC(final double tempC) {
        this.tempC = tempC;
    }

    public double getTempF() {
        return tempF;
    }

    public void setTempF(final double tempF) {
        this.tempF = tempF;
    }

    public double getUv() {
        return uv;
    }

    public void setUv(final double uv) {
        this.uv = uv;
    }

    public double getWindMPH() {
        return windMPH;
    }

    public void setWindMPH(final double windMPH) {
        this.windMPH = windMPH;
    }

    public double getWindKPH() {
        return windKPH;
    }

    public void setWindKPH(final double windKPH) {
        this.windKPH = windKPH;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(final int humidity) {
        this.humidity = humidity;
    }

    public int getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(final int windDegree) {
        this.windDegree = windDegree;
    }

    public char getWindDir() {
        return windDir;
    }

    public void setWindDir(final char windDir) {
        this.windDir = windDir;
    }

    public boolean isDay() {
        return isDay;
    }

    public void setDay(final boolean day) {
        isDay = day;
    }

    public ConditionModel getCondition() {
        return condition;
    }

    public void setCondition(final ConditionModel condition) {
        this.condition = condition;
    }
}
