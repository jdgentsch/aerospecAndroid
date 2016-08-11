package com.example.nrg.aerospec;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StartNewScanUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startnewscan_ui);
        Typeface myTypeFace = Typeface.createFromAsset(getAssets(), "Montserrat-Bold.otf");
        TextView myTextView = (TextView)findViewById(R.id.textView3);
        myTextView.setTypeface(myTypeFace);
    }
}
