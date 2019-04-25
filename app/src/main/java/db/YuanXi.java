package db;

import org.litepal.crud.LitePalSupport;

public class YuanXi extends LitePalSupport {
    private String YuanName;
    private String XiName;
    private int ID;
    private int YuanNum;
    private int XiNum;
    private int student_id;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getYuanName() {
        return YuanName;
    }

    public void setYuanName(String yuanName) {
        YuanName = yuanName;
    }

    public String getXiName() {
        return XiName;
    }

    public void setXiName(String xiName) {
        XiName = xiName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getYuanNum() {
        return YuanNum;
    }

    public void setYuanNum(int yuanNum) {
        YuanNum = yuanNum;
    }

    public int getXiNum() {
        return XiNum;
    }

    public void setXiNum(int xiNum) {
        XiNum = xiNum;
    }
}
