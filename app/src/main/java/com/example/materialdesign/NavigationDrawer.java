package com.example.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class NavigationDrawer extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer); // made the navigation drawer as the default view

        toolbar = findViewById(R.id.navigationToolbar);
        setSupportActionBar(toolbar);

    }
}
