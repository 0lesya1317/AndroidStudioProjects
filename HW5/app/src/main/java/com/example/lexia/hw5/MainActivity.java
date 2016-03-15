package com.example.lexia.hw5;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * Created by Olesya on 16-Feb-16.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        TouchImageView img = new TouchImageView(this);
        img.setImageResource(R.drawable.flying);
        img.setMaxZoom(4f);
        setContentView(img);
    }
}