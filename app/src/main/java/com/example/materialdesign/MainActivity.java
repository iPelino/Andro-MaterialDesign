package com.example.materialdesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //adding toolbar
        toolbar = findViewById(R.id.toolbar); // link toolbar object with the toolbar in layout file
        setSupportActionBar(toolbar);
    }

    //adding menu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId(); //get id of the selected item

        if (id==R.id.item1_id){

            Toast.makeText(getApplicationContext(),"item1",Toast.LENGTH_SHORT).show(); //for testing purposes

        }else if (id==R.id.item2_id){


        }else if (id==R.id.item3_id){

        }

        return super.onOptionsItemSelected(item);
    }
}
