package com.andreikeda.example.mvcpi.java.home.protocols;

import com.andreikeda.example.mvcpi.java.core.model.ConditionModel;

public interface HomePresenterToViewInterface {
    void initialize();

    void setCondition(ConditionModel condition);

    void setLocationName(String name);

    void setLocationRegion(String region);

    void setTemperature(String temperature);

    void setUV(String uv);
}
