package com.andreikeda.example.mvcpi.java.core.model.response;

import com.andreikeda.example.mvcpi.java.core.model.CurrentModel;
import com.andreikeda.example.mvcpi.java.core.model.LocationModel;

public class GetCurrentWeatherResponse {
    private CurrentModel current;
    private LocationModel location;

    public CurrentModel getCurrent() {
        return current;
    }

    public LocationModel getLocation() {
        return location;
    }

    public void setCurrent(final CurrentModel current) {
        this.current = current;
    }

    public void setLocation(final LocationModel location) {
        this.location = location;
    }
}
