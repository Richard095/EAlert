package com.example.ricardo.ealert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView earthquake_list_view = (ListView) findViewById(R.id.earthquake_list_view);
        ArrayList<String> countriesList = new ArrayList<>();

        countriesList.add("Mexico");
        countriesList.add("España");
        countriesList.add("Alemania");
        countriesList.add("EUA");
        countriesList.add("Inglaterra");

        ArrayAdapter<String> countriesAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,countriesList);

        earthquake_list_view.setAdapter(countriesAdapter);
    }
}
