package com.example.exmb1btncolor;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1;
    Button bold,italic,bolditalic,red,green,blue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.editText);
        bold = findViewById(R.id.bold);
        italic = findViewById(R.id.italic);
        bolditalic = findViewById(R.id.bolditalic);
        red = findViewById(R.id.red);
        green = findViewById(R.id.green);
        blue = findViewById(R.id.blue);

        bold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setTypeface(Typeface.DEFAULT,Typeface.BOLD);
            }
        });
        italic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setTypeface(Typeface.SERIF,Typeface.ITALIC);
            }
        });
        bolditalic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setTypeface(Typeface.SANS_SERIF,Typeface.BOLD_ITALIC);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setTextColor(Color.RED);
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setTextColor(Color.GREEN);
            }
        });
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setTextColor(Color.BLUE);
            }
        });
    }
}
