package com.ludans.studentrollmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.litepal.LitePal;

import java.util.ArrayList;
import java.util.List;

import db.JiangLi;
import db.Student;


public class MainActivity extends AppCompatActivity {

    public Student stu;
    private static final String TAG = "LWT";
    private Button Bt_InputStudent;
    private Button Bt_Updata;
    private Button Bt_Delete;
    private Button Bt_Query;
    private Button Bt_YuanXi;
    private Button Bt_Commit;
    private EditText editText ;
    private EditText editText1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_student_test);

        initView();


    }

    private void initView() {
        Bt_YuanXi = (Button) findViewById(R.id.Bt_StuYuanXi);
        Bt_Commit = (Button) findViewById(R.id.Bt_StuCommit);
        editText = (EditText) findViewById(R.id.Stu_Name);
        editText1 = (EditText) findViewById(R.id.Stu_Num);
        Bt_Commit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initData();
    }
        });
        Bt_YuanXi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LitePal.getDatabase();
                List<Student> student_id = new ArrayList<>();
                student_id = LitePal.select("stuname").limit(1).order("id desc").find(Student.class);
                for (Student student : student_id) {
                    int stu_id = student.getID();
                    Intent intent = new Intent(MainActivity.this, com.ludans.studentrollmanager.JiangLi.class);
                    intent.putExtra("student_id", stu_id);
                    startActivity(intent);
                }
            }
        });
    }

    private void initData() {

        Student student = new Student();
        JiangLi jiangLi = new JiangLi();

        student.setStuName(editText.getText().toString());
        //String型转 int 类型 借助 Integer类
        student.setStuNum(Integer.valueOf(editText1.getText().toString()));

        if (student.save()) {
            Log.e(TAG, "上传成功");
        } else {
            Log.e(TAG, "上传失败");
        }
        Toast.makeText(MainActivity.this, "编号:" + student.getID() + " 添加成功", Toast.LENGTH_LONG).show();

    }
}
