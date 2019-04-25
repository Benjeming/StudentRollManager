package db;

import org.litepal.crud.LitePalSupport;

public class ZhuanYe extends LitePalSupport {
    private String ZhuanYeName;
    private int ZhuanYeTime;
    private int ZhuanYeNum;
    private int ID;
    private int student_id;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getZhuanYeName() {
        return ZhuanYeName;
    }

    public void setZhuanYeName(String zhuanYeName) {
        ZhuanYeName = zhuanYeName;
    }

    public int getZhuanYeTime() {
        return ZhuanYeTime;
    }

    public void setZhuanYeTime(int zhuanYeTime) {
        ZhuanYeTime = zhuanYeTime;
    }

    public int getZhuanYeNum() {
        return ZhuanYeNum;
    }

    public void setZhuanYeNum(int zhuanYeNum) {
        ZhuanYeNum = zhuanYeNum;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
