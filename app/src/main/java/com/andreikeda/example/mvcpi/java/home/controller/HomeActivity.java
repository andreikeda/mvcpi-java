package com.andreikeda.example.mvcpi.java.home.controller;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.andreikeda.example.mvcpi.java.home.presenter.HomePresenter;
import com.andreikeda.example.mvcpi.java.home.protocols.HomeControllerToPresenterInterface;
import com.andreikeda.example.mvcpi.java.home.protocols.HomePresenterToControllerInterface;
import com.andreikeda.example.mvcpi.java.core.view.LoadingView;
import com.andreikeda.example.mvcpi.java.home.protocols.HomePresenterToViewInterface;
import com.andreikeda.example.mvcpi.java.home.protocols.HomeViewToPresenterInterface;
import com.andreikeda.example.mvcpi.java.home.view.HomeView;

public class HomeActivity extends AppCompatActivity implements HomePresenterToControllerInterface {

    @Nullable
    private HomeControllerToPresenterInterface presenter;

    @Override
    public void showCustomView(
        HomePresenterToViewInterface view,
        final HomeViewToPresenterInterface presenter
    ) {
        view = new HomeView(this, presenter);
        setContentView((View) view);
        if (this.presenter != null) {
            this.presenter.setView(view);
        }
    }

    @Override
    public void showLoadingView() {
        setContentView(new LoadingView(this));
    }

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initializeVariables();
        if (presenter != null) {
            presenter.onCreate(savedInstanceState);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        if (presenter != null) {
            presenter.onStart();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (presenter != null) {
            presenter.onResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        if (presenter != null) {
            presenter.onPause();
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        if (presenter != null) {
            presenter.onRestart();
        }
    }

    @Override
    protected void onDestroy() {
        if (presenter != null) {
            presenter.onDestroy();
        }
        presenter = null;

        super.onDestroy();
    }

    private void initializeVariables() {
        presenter = new HomePresenter(this);
    }
}
