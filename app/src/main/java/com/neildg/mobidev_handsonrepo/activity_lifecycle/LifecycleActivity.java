package com.neildg.mobidev_handsonrepo.activity_lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.neildg.mobidev_handsonrepo.R;

public class LifecycleActivity extends AppCompatActivity {
    private final static String TAG = "LifecycleActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
    }
}
