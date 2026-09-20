package com.example.nativeapp;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("Hello from Example Native App!");
        text.setTextSize(22);
        text.setTextColor(Color.BLACK);
        text.setGravity(Gravity.CENTER);

        setContentView(text);
    }
}
