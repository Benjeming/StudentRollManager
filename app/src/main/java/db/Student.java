package db;


import org.litepal.crud.LitePalSupport;

import java.util.ArrayList;
import java.util.List;

public class Student extends LitePalSupport {
    private int ID;
    private String StuName;
    private int StuNum;
    private String StuClass;
    private String sex;
    private String BirthDay;
    private String phone;
    private String Political;//政治面貌
    private String address;//住址
    private String nation;//民族
    //陆微腾
    //表关联
    private  YuanXi yaunXi;
    private ZhuanYe zhuanYe;
    private List<JiangLi> jiangLiList = new ArrayList<JiangLi>();

    public YuanXi getYaunXi() {
        return yaunXi;
    }

    public void setYaunXi(YuanXi yaunXi) {
        this.yaunXi = yaunXi;
    }

    public ZhuanYe getZhuanYe() {
        return zhuanYe;
    }

    public void setZhuanYe(ZhuanYe zhuanYe) {
        this.zhuanYe = zhuanYe;
    }

    public List<JiangLi> getJiangLiList() {
        return jiangLiList;
    }

    public void setJiangLiList(List<JiangLi> jiangLiList) {
        this.jiangLiList = jiangLiList;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String stuName) {
        StuName = stuName;
    }

    public int getStuNum() {
        return StuNum;
    }

    public void setStuNum(int stuNum) {
        StuNum = stuNum;
    }

    public String getStuClass() {
        return StuClass;
    }

    public void setStuClass(String stuClass) {
        StuClass = stuClass;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(String birthDay) {
        BirthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPolitical() {
        return Political;
    }

    public void setPolitical(String political) {
        Political = political;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
}
