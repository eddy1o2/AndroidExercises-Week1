package com.example.eddy102.firstdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnChangeTitle = (Button) findViewById(R.id.btnChangeTittle);
        Button btnChangeBackground = (Button) findViewById(R.id.btnChangeBackground);
        imageView = (ImageView) findViewById(R.id.imageView);
        textView = (TextView) findViewById(R.id.textView);

        btnChangeTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ChangeTittleActivity.class);
                intent.putExtra("currentText",textView.getText());
                intent.putExtra("currentColor",textView.getCurrentTextColor());
                int REQUEST_CODE = 102;
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

        btnChangeBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ChangeBackground.class);
                int REQUEST_CODE_2 = 1020;
                startActivityForResult(i, REQUEST_CODE_2);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        if (requestCode == 102 && resultCode == RESULT_OK){
            textView.setText(data.getExtras().getString("text_key"));
            textView.setTextColor(data.getExtras().getInt("color_key"));
        }

        if (requestCode == 1020 && resultCode == RESULT_OK){
            if (data.getExtras().getInt("loadPic") != 0)
                Picasso.with(this).load(data.getExtras().getInt("loadPic")).into(imageView);
        }
    }
}