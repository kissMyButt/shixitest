package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("infomation")
public class Infomation {
    private  Integer iid;
    private  Integer isid;
    private  Integer ieid;
    private  Integer itid;
    private Date begindate;
    private Date enddate;
    private  String position;
    private  boolean certify;
    private  Integer score;
    private String salary;

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public Integer getIsid() {
        return isid;
    }

    public void setIsid(Integer isid) {
        this.isid = isid;
    }

    public Integer getIeid() {
        return ieid;
    }

    public void setIeid(Integer ieid) {
        this.ieid = ieid;
    }

    public Integer getItid() {
        return itid;
    }

    public void setItid(Integer itid) {
        this.itid = itid;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isCertify() {
        return certify;
    }

    public void setCertify(boolean certify) {
        this.certify = certify;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
