package com.example.freebird.dexsinch;

import android.content.Intent;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startCallActivity(View view) {
        Intent myIntent = new Intent(MainActivity.this, VideoCallActivity.class);
        MainActivity.this.startActivity(myIntent);
    }
}
