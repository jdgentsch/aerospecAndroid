package com.example.nrg.aerospec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuUIScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_uiscreen);
    }

    public void newScanButtonClick(View v) {
        Intent intentNewScan = new Intent(this, StartNewScanUI.class);
        startActivity(intentNewScan);
    }

    public void filterButtonClick(View v) {
        Intent intentFilter = new Intent(this, MainFilterScreen.class);
        startActivity(intentFilter);
    }

    public void analyzeButtonClick(View v) {
        Intent intentAnalyze = new Intent(this, MainAnalyzeScreen.class);
        startActivity(intentAnalyze);
    }

    public void prevScanButtonClick(View v) {
        Intent intentPractice = new Intent(this, PreviousScans.class);
        startActivity(intentPractice);
    }
}
