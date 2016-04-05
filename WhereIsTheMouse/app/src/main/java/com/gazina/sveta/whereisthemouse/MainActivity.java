package com.gazina.sveta.whereisthemouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    static int size = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button fourButton = (Button) findViewById(R.id.four);
        Button fiveButton = (Button) findViewById(R.id.five);
        Button sixButton = (Button) findViewById(R.id.six);

        // Capture button clicks
        fourButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                size = 4;

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        GameActivity.class);
                myIntent.putExtra("size", size);
                startActivity(myIntent);
            }

        });
        fiveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                size = 5;

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        GameActivity.class);
                myIntent.putExtra("size", size);
                startActivity(myIntent);
            }

        });
        sixButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                size = 6;

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        GameActivity.class);
                myIntent.putExtra("size", size);
                startActivity(myIntent);
            }

        });
    }
}
