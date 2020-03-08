package com.example.myapplicationandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextview1,mBtnTextview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextview1=findViewById(R.id.btn_textview1);
        mBtnTextview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //jump?
                Intent intent = new Intent(MainActivity.this,TextViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnTextview2=findViewById(R.id.btn_textview2);
        mBtnTextview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //jump?
                Intent intent = new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });
        mBtnTextview2=findViewById(R.id.btn_textview3);
        mBtnTextview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //jump?
                Intent intent = new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });
        mBtnTextview2=findViewById(R.id.btn_textview4);
        mBtnTextview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //jump?
                Intent intent = new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });
    }
}
