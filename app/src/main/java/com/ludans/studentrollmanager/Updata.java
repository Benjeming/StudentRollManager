package com.ludans.studentrollmanager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import db.Student;

public class Updata extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.updata_student_test);
        final EditText Ed_updata_stuname = (EditText)findViewById(R.id.Ed_Updata_stuname);
        final EditText Ed_updata_stunum =(EditText)findViewById(R.id.Ed_Updata_stunum);
        final EditText Ed_updata_id = (EditText)findViewById(R.id.Ed_Updata_id);
        Button Bt_commit = (Button)findViewById(R.id.Bt_Updata_commit);
        Bt_commit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student = new Student();
                student.setStuNum(Integer.valueOf(Ed_updata_stunum.getText().toString()));
                student.setStuName(Ed_updata_stuname.getText().toString());
                student.updateAll("id = ?",Ed_updata_id.getText().toString());
                Toast.makeText(Updata.this,"编号："+Ed_updata_id.getText().toString()+"  修改成功",Toast.LENGTH_LONG).show();

            }
        });

    }
}
