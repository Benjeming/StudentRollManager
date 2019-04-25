package com.ludans.studentrollmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ZhuanYe extends AppCompatActivity {

    private Button Bt_ZhuanYe_Commit;
    private Button Bt_ZhuanYe;//上一页
    private EditText editText;//专业编号
    private EditText editText1;//学制
    private EditText editText2;//专业名称

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_zhuanye_test);
        initView();
        initData();

    }

    private void initView() {
        Bt_ZhuanYe_Commit = (Button) findViewById(R.id.Bt_Zhuanye_Commit);
        Bt_ZhuanYe = (Button) findViewById(R.id.Bt_ZhuanYe_YuanXi);//上一页
         editText = (EditText) findViewById(R.id.ZhuanYe_Num);//专业编号
         editText1 = (EditText) findViewById(R.id.ZhuanYe_XueZi);//学制
         editText2 = (EditText) findViewById(R.id.ZhuanYe_Name);//专业名称
    }

    private void initData() {
        Bt_ZhuanYe_Commit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.ZhuanYe zhuanYe = new db.ZhuanYe();

                zhuanYe.setZhuanYeName(editText2.getText().toString());//名称
                //String型转 int 类型 借助 Integer类
                zhuanYe.setZhuanYeNum(Integer.valueOf(editText1.getText().toString()));//学制
                zhuanYe.setZhuanYeTime(Integer.valueOf(editText.getText().toString()));//编号

                zhuanYe.save();
                Toast.makeText(ZhuanYe.this, "编号:" + zhuanYe.getID() + " 添加成功", Toast.LENGTH_LONG).show();
            }
        });

//        Bt_YuanXi_JiangLi.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(ZhuanYe.this , JiangLi.class);
//                startActivity(intent);
//            }
//        });

        Bt_ZhuanYe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZhuanYe.this, YuanXi.class);
                startActivity(intent);



            }
        });
    }


}
