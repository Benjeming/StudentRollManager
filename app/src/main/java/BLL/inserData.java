package BLL;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;

import com.ludans.studentrollmanager.R;
import com.ludans.studentrollmanager.YuanXi;


import db.*;

public class inserData extends AppCompatActivity {


    public inserData(Student student) {
    }
    public inserData(db.YuanXi yuanXi) {
    }
    public inserData(db.ZhuanYe zhuanYe) {
    }
    public inserData(db.JiangLi jiangLi) {
    }
    public void inserd(Student student){
        EditText editText = (EditText) findViewById(R.id.Stu_Name);
        EditText editText1 = (EditText) findViewById(R.id.Stu_Num);
        student.setStuName(editText.getText().toString());

        //String型转 int 类型 借助 Integer类
        student.setStuNum(Integer.valueOf(editText1.getText().toString()));
        student.save();
    }
    public void inserd(db.YuanXi yuanXi){
        EditText editText = (EditText) findViewById(R.id.YuanXi_Name);
        EditText editText1 = (EditText) findViewById(R.id.YuanXi_Num);
        yuanXi.setYuanName(editText.getText().toString());
        //String型转 int 类型 借助 Integer类
        yuanXi.setYuanNum(Integer.valueOf(editText1.getText().toString()));
        yuanXi.save();
    }
    public void inserd(db.ZhuanYe zhuanYe){
        EditText editText = (EditText) findViewById(R.id.ZhuanYe_Num);//专业编号
        EditText editText1 = (EditText) findViewById(R.id.ZhuanYe_XueZi);//学制
        EditText editText2 = (EditText)findViewById(R.id.ZhuanYe_Name);//专业名称
        zhuanYe.setZhuanYeName(editText2.getText().toString());//名称
        //String型转 int 类型 借助 Integer类
        zhuanYe.setZhuanYeNum(Integer.valueOf(editText1.getText().toString()));//学制
        zhuanYe.setZhuanYeTime(Integer.valueOf(editText.getText().toString()));//编号
        zhuanYe.save();
    }
    public void inserd(db.JiangLi jiangLi){
        EditText ed_Name = (EditText) findViewById(R.id.JiangLi_Name);//奖励事件
        EditText ed_Level = (EditText) findViewById(R.id.JiangLi_Level);//奖励等级
        EditText ed_DanWei = (EditText)findViewById(R.id.JiangLi_DanWei);//奖励单位
        EditText ed_Time = (EditText)findViewById(R.id.JiangLi_Time);//奖励时间
        jiangLi.setJiangLiName(ed_Name.getText().toString());
        jiangLi.setJiangLiLevel(Integer.valueOf(ed_Level.getText().toString()));
        jiangLi.setJiangLiDanWei(ed_DanWei.getText().toString());
        jiangLi.setJiangLiTime(ed_Time.getText().toString());
        jiangLi.save();
    }
}
