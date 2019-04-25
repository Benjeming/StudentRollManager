package com.ludans.studentrollmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import db.Student;

public class JiangLi extends AppCompatActivity {
    private static final String TAG = "Lwt";

    private Button Bt_up;
    private Button Bt_JiangLi_Commit;
    private Button Bt_YuanXi_down;
    private EditText ed_Name;//奖励事件
    private EditText ed_Level;//奖励等级
    private EditText ed_DanWei;//奖励单位
    private EditText ed_Time;//奖励时间
    private int getStudentValue;

    public int getGetStudentValue() {
        return getStudentValue;
    }

    public void setGetStudentValue(int getStudentValue) {
        this.getStudentValue = getStudentValue;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_jiangli_test);
        initView();
//        sendStudentId();

    }

    private int sendStudentId() {
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Log.e(TAG, "函数里的值: "+   bundle.getInt("student_id"));

       return bundle.getInt("student_id");



    }

    private void initView() {

        Bt_up = (Button) findViewById(R.id.Bt_JiangLi_Up);
        Bt_YuanXi_down = (Button) findViewById(R.id.Bt_YuanXi_Down);
        Bt_JiangLi_Commit = (Button) findViewById(R.id.Bt_JiangLi_Commit);
        ed_Name = (EditText) findViewById(R.id.JiangLi_Name);//奖励事件
        ed_Level = (EditText) findViewById(R.id.JiangLi_Level);//奖励等级
        ed_DanWei = (EditText) findViewById(R.id.JiangLi_DanWei);//奖励单位
        ed_Time = (EditText) findViewById(R.id.JiangLi_Time);//奖励时间


        Bt_JiangLi_Commit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.JiangLi jiangLi = new db.JiangLi();
                Student student = new Student();

                Intent intent = getIntent();
                Log.d(TAG, "传过来的数据是：" + intent.getIntExtra("student_id", 0) + "   ");


                jiangLi.setJiangLiName(ed_Name.getText().toString());
                jiangLi.setJiangLiLevel(Integer.valueOf(ed_Level.getText().toString()));
                jiangLi.setJiangLiDanWei(ed_DanWei.getText().toString());
                jiangLi.setJiangLiTime(ed_Time.getText().toString());

                jiangLi.setStudent(student);
                jiangLi.setStudent_id(intent.getIntExtra("student_id", 0));
                Log.d(TAG, "学生ID:  " + jiangLi.getStudent_id());
                jiangLi.save();
                Toast.makeText(JiangLi.this, "编号:" + jiangLi.getID() + " 添加成功", Toast.LENGTH_LONG).show();
            }
        });


        Bt_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JiangLi.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Bt_YuanXi_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JiangLi.this, YuanXi.class);
//                intent.putExtra("student_id",sendStudentId());
                startActivity(intent);
            }
        });


    }
}
