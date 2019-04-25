package com.ludans.studentrollmanager;

import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DialogTitle;
import android.support.v7.widget.LinearLayoutCompat;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.litepal.LitePal;

import java.util.ArrayList;
import java.util.List;

import db.Student;
import db.YuanXi;

public class Query extends AppCompatActivity {
    private static final String TAG = "Query";
    private List<Student> students = new ArrayList<Student>();
    private List<YuanXi> yuanXis = new ArrayList<YuanXi>();
    private Student student;
    private LinearLayoutCompat layoutCompat;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.query);
        final EditText Ed_Query = (EditText) findViewById(R.id.Query_num);
        //获取的数据

        final TextView Ed_query_data = (TextView) findViewById(R.id.Query_getData);
        final EditText Ed_query_name = (EditText) findViewById(R.id.Query_name);

//        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        RecyclerView rv = (RecyclerView)findViewById(R.id.rv_query);
//        rv.setLayoutManager(linearLayoutManager);
//        rv.setAdapter(new QueryAdapter(students));
        Button Bt_Query = (Button) findViewById(R.id.Bt_Query);
        Bt_Query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //写SQl操作  将获取的数据提交到

                students = LitePal.where("stunum = ? ", Ed_Query.getText().toString()).find(Student.class);
                Log.d(TAG, "students.get(0).getId():"+students.get(0).getID());
                yuanXis = LitePal.where("student_id = ?", String.valueOf(students.get(0).getID())).find(YuanXi.class);

                getStudentValue();

                for (YuanXi yuanXi : yuanXis) {
                    Log.d(TAG, "学生_id: "+yuanXi.getStudent_id());
//                    Log.d(TAG, "学生 姓名 ："yuanXi.);
                }
//                Integer  idname = student.getStuNum();
//                idname.toString();

//                Ed_query_data  放在上面会出现 空引用,只能放在for 循环中
                for (Student student : students) {
                    Ed_query_data.setText("  姓名：" + student.getStuName()
                            + "  学号：" + student.getStuNum()
                            + "  专业:"
                            + student.getID());

                    Log.d(TAG, "Student Id: " + student.getID());
                    Log.d(TAG, "Student's Name: " + student.getStuName());
                    Log.d(TAG, "Student's Num: " + student.getStuNum());
                }
            }

            private int getStudentValue() {

            return  0;
            }

        });

    }
}
