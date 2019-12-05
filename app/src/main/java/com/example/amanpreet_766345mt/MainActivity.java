package com.example.amanpreet_766345mt;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int price = 0;
    int seekValue = 1;
    private Spinner cars;
    private  EditText dailyRent;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dailyRent = findViewById(R.id.dailyrent);
        cars = findViewById(R.id.choosecar);
        final EditText carPrice = findViewById(R.id.dailyrent);
        carPrice.setEnabled(false);
        carPrice.setTextColor(Color.parseColor("#000000"));
        final String[] carsRented = getResources().getStringArray(R.array.dRent);
        RadioGroup rg = findViewById(R.id.radiogroup);
        SeekBar seek = findViewById(R.id.seekBar);
        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                seekValue = i+1;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        cars.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                price = Integer.parseInt(carsRented[i]);
                dailyRent.setText(carsRented[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {



            }
        });






    }


}
