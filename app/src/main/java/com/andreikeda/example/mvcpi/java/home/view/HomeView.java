package com.andreikeda.example.mvcpi.java.home.view;

import android.content.Context;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.andreikeda.example.mvcpi.java.core.model.ConditionModel;
import com.andreikeda.example.mvcpi.java.home.protocols.HomePresenterToViewInterface;
import com.andreikeda.example.mvcpi.java.home.protocols.HomeViewToPresenterInterface;

public class HomeView extends LinearLayout implements HomePresenterToViewInterface {
    private HomeViewToPresenterInterface presenter;

    private TextView tvCondition;
    private TextView tvLocationName;
    private TextView tvLocationRegion;
    private TextView tvTemperature;
    private TextView tvUV;

    public HomeView(final Context context,
        final HomeViewToPresenterInterface presenter) {
        super(context);
        this.presenter = presenter;
    }

    @Override
    public void initialize() {
        setOrientation(LinearLayout.VERTICAL);
    }

    @Override
    public void setCondition(final ConditionModel condition) {
        tvCondition = new TextView(getContext());
        tvCondition.setLayoutParams(new LinearLayout.LayoutParams(
            LayoutParams.MATCH_PARENT,
            LayoutParams.WRAP_CONTENT
        ));
        if (condition.getText() != null) {
            tvCondition.setText(condition.getText());
        }
        tvCondition.setGravity(Gravity.CENTER);
        addView(tvCondition);
    }

    @Override
    public void setLocationName(final String name) {
        tvLocationName = new TextView(getContext());
        tvLocationName.setLayoutParams(new LayoutParams(
            LayoutParams.MATCH_PARENT,
            LayoutParams.WRAP_CONTENT
        ));
        if (name != null) {
            tvLocationName.setText(name);
        }
        tvLocationName.setGravity(Gravity.CENTER);
        addView(tvLocationName);
    }

    @Override
    public void setLocationRegion(final String region) {
        tvLocationRegion = new TextView(getContext());
        tvLocationRegion.setLayoutParams(new LayoutParams(
            LayoutParams.MATCH_PARENT,
            LayoutParams.WRAP_CONTENT
        ));
        if (region != null) {
            tvLocationRegion.setText(region);
        }
        tvLocationRegion.setGravity(Gravity.CENTER);
        addView(tvLocationRegion);
    }

    @Override
    public void setTemperature(final String temperature) {
        tvTemperature = new TextView(getContext());
        tvTemperature.setLayoutParams(new LayoutParams(
            LayoutParams.MATCH_PARENT,
            LayoutParams.WRAP_CONTENT
        ));
        if (temperature != null) {
            tvTemperature.setText(String.format("%s ˚C", temperature));
        }
        tvTemperature.setGravity(Gravity.CENTER);
        addView(tvTemperature);
    }

    @Override
    public void setUV(final String uv) {
        tvUV = new TextView(getContext());
        tvUV.setLayoutParams(new LayoutParams(
            LayoutParams.MATCH_PARENT,
            LayoutParams.WRAP_CONTENT
        ));
        if (tvUV != null) {
            tvUV.setText(String.format("UV: %s", uv));
        }
        tvUV.setGravity(Gravity.CENTER);
        addView(tvUV);
    }
}
