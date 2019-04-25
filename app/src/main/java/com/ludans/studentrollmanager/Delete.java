package com.ludans.studentrollmanager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.litepal.LitePal;

import db.Student;

public class Delete extends AppCompatActivity {




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete_student_test);

        final EditText editText = (EditText)findViewById(R.id.delect_stunum);
        Button Bt_Delect_commit = (Button)findViewById(R.id.delect_commit);
        Bt_Delect_commit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LitePal.deleteAll(Student.class,"stunum = ?",editText.getText().toString());
                Toast.makeText(Delete.this,editText.getText().toString()+"删除成功",Toast.LENGTH_LONG).show();
            }
        });
    }

}
