package com.example.eddy102.firstdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ChangeBackground extends AppCompatActivity {
    public int picNums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_background);

        Button btnSavePic = (Button) findViewById(R.id.btnSavePic);
        ImageView pic1 = (ImageView) findViewById(R.id.pic1);
        ImageView pic2 = (ImageView) findViewById(R.id.pic2);
        ImageView pic3 = (ImageView) findViewById(R.id.pic3);
        ImageView pic4 = (ImageView) findViewById(R.id.pic4);
        ImageView pic5 = (ImageView) findViewById(R.id.pic5);
        ImageView pic6 = (ImageView) findViewById(R.id.pic6);

        final View viewPic = (View) findViewById(R.id.viewPic);

        pic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                picNums = R.drawable.shutterstock_130125752_huge;
                viewPic.setBackgroundResource(picNums);
            }
        });

        pic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                picNums = R.drawable.shutterstock_248651677_supersize;
                viewPic.setBackgroundResource(picNums);
            }
        });

        pic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                picNums = R.drawable.shutterstock_280897220_huge;
                viewPic.setBackgroundResource(picNums);
            }
        });

        pic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                picNums = R.drawable.shutterstock_316465280_huge;
                viewPic.setBackgroundResource(picNums);
            }
        });

        pic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                picNums = R.drawable.shutterstock_333376544_huge;
                viewPic.setBackgroundResource(picNums);
            }
        });

        pic6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                picNums = R.drawable.shutterstock_390660301_huge;
                viewPic.setBackgroundResource(picNums);
            }
        });

        btnSavePic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    public void finish(){
        Intent data = new Intent();
        data.putExtra("loadPic",picNums);
        setResult(RESULT_OK, data);
        super.finish();
    }
}
