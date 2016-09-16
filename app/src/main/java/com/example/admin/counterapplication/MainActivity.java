package com.example.admin.counterapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int value=0;
    int valueV=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plusTwoH(View view){

        value=value+2;
        displayHome(value);
    }

    public void plusThreeH(View view){

        value=value+3;
        displayHome(value);
    }

    public void  plusthreeV(View view){
        valueV= valueV+3;
        displayV(valueV);
    }

    public void  plusTwoV(View view){
        valueV= valueV+2;
        displayV(valueV);
    }
    public void  freeThrowH(View view){
        value= value+1;
        displayHome(value);
    }
    public void  freeThrowV(View view){
        valueV= valueV+1;
        displayV(valueV);

    }
public void reset(View view){
    valueV=00;
    value=00;
    displayHome(value);
    displayV(valueV);
}
    private void displayHome(int number){
        TextView txtHome=(TextView)findViewById(R.id.txtScoreHome);
        txtHome.setText(""+number);
    }

    private void displayV(int number){
        TextView txtHome=(TextView)findViewById(R.id.txtScoreV);
        txtHome.setText(""+number);
    }
}
