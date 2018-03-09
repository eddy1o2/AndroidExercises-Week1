package com.example.eddy102.firstdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class ChangeTittleActivity extends AppCompatActivity {
    public String text;
    public int colorText;
    public int temp = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_tittle);

        final Bundle extras = getIntent().getExtras();

        final EditText editText = (EditText) findViewById(R.id.edt);
        editText.setText(extras.getString("currentText"));

        Button btnSave = (Button) findViewById(R.id.btnSave);
        ImageView pinkColor = (ImageView) findViewById(R.id.iv1);
        ImageView purpleColor = (ImageView) findViewById(R.id.iv2);
        ImageView indigoColor = (ImageView) findViewById(R.id.iv3);
        ImageView blueColor = (ImageView) findViewById(R.id.iv4);
        ImageView tealColor = (ImageView) findViewById(R.id.iv5);
        ImageView greenColor = (ImageView) findViewById(R.id.iv6);

        final View viewSample = (View) findViewById(R.id.viewSample);
        viewSample.setBackgroundColor(extras.getInt("currentColor"));

        pinkColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorText = getResources().getColor(R.color.pink);
                viewSample.setBackgroundColor(colorText);
                temp = 1;
            }
        });

        purpleColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorText = getResources().getColor(R.color.purple);
                viewSample.setBackgroundColor(colorText);
                temp = 2;
            }
        });

        indigoColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorText = getResources().getColor(R.color.indigo);
                viewSample.setBackgroundColor(colorText);
                temp = 3;
            }
        });

        blueColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorText = getResources().getColor(R.color.blue);
                viewSample.setBackgroundColor(colorText);
                temp = 4;
            }
        });

        tealColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorText = getResources().getColor(R.color.teal);
                viewSample.setBackgroundColor(colorText);
                temp = 5;
            }
        });

        greenColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                colorText = getResources().getColor(R.color.green);
                viewSample.setBackgroundColor(colorText);
                temp = 6;
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = editText.getText().toString();
                if (temp == 0)
                    colorText = extras.getInt("currentColor");
                finish();
            }
        });

    }
    @Override
    public void finish(){
        Intent data = new Intent();
        data.putExtra("text_key", text);
        data.putExtra("color_key", colorText);
        setResult(RESULT_OK, data);
        super.finish();
    }

}
