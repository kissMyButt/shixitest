package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("log")
public class Log {
    private Integer lid;
    private Integer sid;
    private Date begindate;
    private Date enddate;
    private Integer eid;
    private String location;
    private String position;
    private String content;
    private String sevaluaiton;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
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

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSevaluaiton() {
        return sevaluaiton;
    }

    public void setSevaluaiton(String sevaluaiton) {
        this.sevaluaiton = sevaluaiton;
    }
}
