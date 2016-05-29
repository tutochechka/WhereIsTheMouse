package com.gazina.sveta.whereisthemouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
    private final CellControl control = new CellControl();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        control.setNewGame();

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this, control.getSize() * control.getSize()));
        gridview.setNumColumns(control.getSize());

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            public void onItemClick(AdapterView<?> parent, View v, int position,
                                    long id) {

                ImageView imageView = (ImageView) v;
                imageView.setImageResource(control.getCellType(control.getRow(position), control.getColumn(position)));


            }
        });

        // Locate the button in activity_game.xml
        Button newGameButton = (Button) findViewById(R.id.new_game);
        Button BackButton = (Button) findViewById(R.id.back);

        // Capture button clicks
        newGameButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(GameActivity.this,
                        GameActivity.class);
                startActivity(myIntent);
            }

        });
        BackButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(GameActivity.this,
                        GameActivity.class);
                startActivity(myIntent);
            }

        });
    }


}
