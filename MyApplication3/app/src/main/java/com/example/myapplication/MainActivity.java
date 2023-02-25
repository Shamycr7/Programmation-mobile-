package com.example.myapplication;

import static java.lang.Character.getType;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
/*
    SensorManager sensorManager ;


    private void listSensor () {
        List<Sensor> sensors = sensorManager.getSensorList(Sensor.TYPE_ALL);
        StringBuffer sensorDesc = new StringBuffer();
        for (Sensor sensor : sensors) {
            sensorDesc.append("New sensor detected : \r\n");
            sensorDesc.append("\tName: " + sensor.getName() + "\r\n");
            sensorDesc.append("\tType: " + getType(sensor.getType()) + "\r\n");
            sensorDesc.append("Version: " + sensor.getVersion() + "\r\n");
            sensorDesc.append("Resolution (in the sensor unit): " +
                    sensor.getResolution() + "\r\n");
            sensorDesc.append("Power in mA used by this sensor while in use" +
                    sensor.getPower() + "\r\n");
            sensorDesc.append("Vendor: " + sensor.getVendor() + "\r\n");
            sensorDesc.append("Maximum range of the sensor in the sensor's unit." +
                    sensor.getMaximumRange() + "\r\n");
            sensorDesc.append("Minimum delay allowed between two events in microsecond »" + " or zero if this sensor only returns a value when the data its measuring changes »" + sensor.getMinDelay() + "\r\n");
            Toast.makeText(this, sensorDesc.toString(), Toast.LENGTH_LONG).show();
        }
    }

*/

   private SensorManager sensorManager;
    private List<Sensor> listeCapteur;
    private TextView listeCapteurString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        //listSensor();
       sensorManager=(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        listeCapteurString = findViewById(R.id.capteurString);
        listeCapteur = sensorManager.getSensorList(Sensor.TYPE_ALL);
        getCapteur();

       }
    @SuppressLint("SetTextI18n")
   private void getCapteur() {
        int i =1;
       for (Sensor s : listeCapteur) {

           listeCapteurString.setText(listeCapteurString.getText() + "\n" +
                    i+")"+ "Nom du capteur  = " + s.getName() + "\n" +
                    "Type du capteur = " + s.getType() + "\n" +
                    "Version du capteur = " + s.getVersion() + "\n" +
                    "Resolution (in the sensor unit): " +
                   s.getResolution() + "\r\n" +
                    "Power in mA used by this sensor while in use" +
                   s.getPower() + "\r\n" +
                    "Vendor: " + s.getVendor() + "\r\n" +
                   "Maximum range of the sensor in the sensor's unit." +
                   s.getMaximumRange() + "\r\n" +
                   "Minimum delay allowed between two events in microsecond »" + " or zero if this sensor only returns a value when the data its measuring changes »" + s.getMinDelay() + "\r\n");
                    i++;
       }
   }
}