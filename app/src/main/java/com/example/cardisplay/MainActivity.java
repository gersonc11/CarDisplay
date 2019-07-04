package com.example.cardisplay;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    

    private static final String TAG = "string";
    //    Declare View
    ListView listView;
    Button btnLoad;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Init views
        listView = findViewById(R.id.lv_car_display);
        btnLoad = findViewById(R.id.btn_show_cars);

        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Car> data = getCarData();
                setupListView(data);
            }
        });
}

    private void setupListView(List<Car> data) {
        Log.d(TAG, "setupListView" + data);

//        Declare and Init our adapter
        StableArrayAdapter adapter = new StableArrayAdapter(MainActivity.this, data);

//        set the adapter to the listview
        listView.setAdapter(adapter);

//        set onItemClickListener to ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                retrieve the value fro the parent using the position passed in
                Car value = (Car) parent.getItemAtPosition(position);
//                Toast to show value that was clicked
                Toast.makeText(MainActivity.this, "" + value, Toast.LENGTH_LONG).show();
            }
        });
    }

    private List<Car> getCarData() {

        Car Beetle = new Car();
        Car Mustang = new Car();
        Car Jetta = new Car();
        Car Camry = new Car();
        Car Cherokee = new Car();
        Car Picnic = new Car();

        //        Declare and Init List
        List<Car> cars = new ArrayList<>();
        cars.add(Beetle);
        cars.add(Mustang);
        cars.add(Jetta);
        cars.add(Camry);
        cars.add(Cherokee);
        cars.add(Picnic);

        return cars;
    }
}
