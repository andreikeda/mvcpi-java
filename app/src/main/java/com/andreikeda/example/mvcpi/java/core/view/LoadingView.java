package com.andreikeda.example.mvcpi.java.core.view;

import android.content.Context;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

public class LoadingView extends LinearLayout {

    public LoadingView(final Context context) {
        super(context);

        initializeView();
    }

    private void initializeView() {
        setBackgroundResource(android.R.color.white);
        setLayoutParams(new LinearLayout.LayoutParams(
            LayoutParams.MATCH_PARENT,
            LayoutParams.MATCH_PARENT
        ));
        setGravity(Gravity.CENTER);

        final ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT
        ));
        addView(progressBar);
    }
}
