package db;

import org.litepal.crud.LitePalSupport;

public class JiangLi extends LitePalSupport {
    private int ID;
    private String JiangLiName;
    private int JiangLiLevel;
    private String JiangLiTime;
    private String JiangLiDanWei;
    //表关联
    private Student student;
    private int student_id;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getJiangLiName() {
        return JiangLiName;
    }

    public void setJiangLiName(String jiangLiName) {
        JiangLiName = jiangLiName;
    }

    public int getJiangLiLevel() {
        return JiangLiLevel;
    }

    public void setJiangLiLevel(int jiangLiLevel) {
        JiangLiLevel = jiangLiLevel;
    }

    public String getJiangLiTime() {
        return JiangLiTime;
    }

    public void setJiangLiTime(String jiangLiTime) {
        JiangLiTime = jiangLiTime;
    }

    public String getJiangLiDanWei() {
        return JiangLiDanWei;
    }

    public void setJiangLiDanWei(String jiangLiDanWei) {
        JiangLiDanWei = jiangLiDanWei;
    }
}
