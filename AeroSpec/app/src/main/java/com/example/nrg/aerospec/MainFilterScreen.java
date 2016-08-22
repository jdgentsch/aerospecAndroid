package com.example.nrg.aerospec;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainFilterScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_filter);
        /*
        Typeface emailTypeface = Typeface.createFromAsset(getAssets(), "Montserrat-Hairline.otf");
        TextView emailTextview = (EditText)findViewById(R.id.editText);
        emailTextview.setTypeface(emailTypeface);

        Typeface fgTypeface = Typeface.createFromAsset(getAssets(), "Montserrat-Light.otf");
        TextView fgTextview = (TextView)findViewById(R.id.textView);
        fgTextview.setTypeface(fgTypeface);

        Typeface logTypeface = Typeface.createFromAsset(getAssets(), "Montserrat-UltraLight.otf");
        TextView logTextview = (Button)findViewById(R.id.button);
        logTextview.setTypeface(logTypeface);

        Typeface regTypeface = Typeface.createFromAsset(getAssets(), "Montserrat-UltraLight.otf");
        TextView regTextview = (Button)findViewById(R.id.button2);
        regTextview.setTypeface(regTypeface);
        */
    }
}
