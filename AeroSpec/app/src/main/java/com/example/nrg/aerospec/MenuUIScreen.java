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

    public void buttonOnClick(View v) {
        switch(v.getId()) {
            case R.id.delbtn:
                Intent intentNewScan = new Intent(this, StartNewScanUI.class);
                startActivity(intentNewScan);
                break;
            case R.id.button6:
                Intent intentAnalyze = new Intent(this, MainAnalyzeScreen.class);
                startActivity(intentAnalyze);
                break;
            case R.id.button5:
                Intent intentFilter = new Intent(this, MainFilterScreen.class);
                startActivity(intentFilter);
                break;
        }
    }
}
