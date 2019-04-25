package com.ludans.studentrollmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.BinderThread;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TestMainActivity extends AppCompatActivity {
    private Button Bt_MainInsert;
    private Button Bt_MainUpdata;
    private Button Bt_MainDelect;
    private Button Bt_MainQuery;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activit_zhuye);
        initView();
    }

    private void initView() {
        Bt_MainInsert = (Button) findViewById(R.id.Bt_MainInsert);
        Bt_MainDelect = (Button) findViewById(R.id.Bt_MainDelect);
        Bt_MainQuery = (Button) findViewById(R.id.Bt_MainQuery);
        Bt_MainUpdata =(Button)findViewById(R.id.Bt_MainUpdata);

        Bt_MainUpdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestMainActivity.this,Updata.class);
                startActivity(intent);
            }
        });

        Bt_MainQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestMainActivity.this,Query.class);
                startActivity(intent);
            }
        });
        Bt_MainInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestMainActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Bt_MainDelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TestMainActivity.this,Delete.class);
                startActivity(intent);
            }
        });
    }
}
