package com.hie2j.intent_study;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显式跳转 第一种
//                Intent intent = new Intent();
//                intent.setClass(MainActivity.this,Activity_a.class);
//                startActivity(intent);
                //显式跳转 第二种
//                Intent intent = new Intent();
//                intent.setClassName(MainActivity.this,
//                        "com.hie2j.intent_study.Activity_a");
//                startActivity(intent);
                //显式跳转 第三种
                Intent intent = new Intent();
                intent.setClassName("com.hie2j.intent_study",
                        "com.hie2j.intent_study.Activity_a");
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("ji_pa_fan");
                startActivity(intent);
            }
        });
    }
}
