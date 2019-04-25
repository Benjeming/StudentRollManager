package com.ludans.studentrollmanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class YuanXi extends AppCompatActivity {
    private Button Bt_Yuan_Up;
    private Button Bt_Yuan_down;
    private Button Bt_Yuan_Commit;
    private EditText editText;
    private EditText editText1;
    private static final String TAG = "Lwt";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_yuanxi_test);
        initView();
        //getStudentId();
    }

//    private void getStudentId() {
//        db.YuanXi yuanXi =new db.YuanXi();
//        Intent intent = getIntent();
//        Bundle bundle = intent.getExtras();
//        yuanXi.setStudent_id(bundle.getInt("student_id"));
//        Log.e(TAG, "院校收到的学生id: " + yuanXi.getStudent_id());
////        yuanXi.save();
//    }

    private void initView() {

        Bt_Yuan_Up = (Button) findViewById(R.id.Bt_YuanXi_stu);
        Bt_Yuan_down = (Button) findViewById(R.id.Bt_YuanXi_ZhuanYe);
        Bt_Yuan_Commit = (Button) findViewById(R.id.Bt_YuanXI_Commit);

        Bt_Yuan_Commit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initData();
            }
        });
        //下一页
        Bt_Yuan_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YuanXi.this, ZhuanYe.class);
                startActivity(intent);
            }
        });
        //上一页
        Bt_Yuan_Up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YuanXi.this, JiangLi.class);
                startActivity(intent);
            }
        });
    }

    private void initData() {
        db.YuanXi yuanXi = new db.YuanXi();
        editText = (EditText) findViewById(R.id.YuanXi_Name);
        editText1 = (EditText) findViewById(R.id.YuanXi_Num);
        yuanXi.setYuanName(editText.getText().toString());
        //String型转 int 类型 借助 Integer类
//        getStudentId();
        yuanXi.setYuanNum(Integer.valueOf(editText1.getText().toString()));
        yuanXi.save();
        Toast.makeText(YuanXi.this, "编号:" + yuanXi.getID() + " 添加成功", Toast.LENGTH_LONG).show();
    }

}