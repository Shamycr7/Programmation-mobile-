package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class EXO_2 extends AppCompatActivity {

    private SensorManager sensorManager;
    private List<Sensor> listeCapteur;
    private TextView listeCapteurString;
    private  Sensor mSensor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exo2);

      //  sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        listeCapteurString = findViewById(R.id.capteurString);
        listeCapteur = sensorManager.getSensorList(Sensor.TYPE_ALL);

        if (sensorManager.getDefaultSensor(Sensor.TYPE_HEART_RATE) != null){

            listeCapteurString.setText(listeCapteurString.getText() + "SUCCESS !");
        }
        else listeCapteurString.setText(listeCapteurString.getText() + " L'application SANTÉ ne pas fontionner !");


    }

    }
