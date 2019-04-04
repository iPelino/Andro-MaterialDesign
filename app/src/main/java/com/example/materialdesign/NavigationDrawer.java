package com.example.materialdesign;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class NavigationDrawer extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer); // made the navigation drawer as the default view

        toolbar = findViewById(R.id.navigationToolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);

        navigationView.setNavigationItemSelectedListener(this);

        //create toggle button for the navigation drawer
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);

        toggle.syncState();

    }

    //To control the action of the navigation drawer items

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int id = menuItem.getItemId(); //get id of the selected menu item

        switch (id){

            case R.id.inbox_id:

                Toast.makeText(getApplicationContext(),"no inbox",Toast.LENGTH_SHORT).show();

                break;
            case R.id.starred_id:

                break;
            case R.id.sent_id:

                break;
            case R.id.drafts_id:

                break;
            case R.id.allmail_id:

                break;
            case R.id.trash_id:

                break;
            case R.id.spam_id:

                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
