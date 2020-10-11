package com.example.demo.bean;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("jobs")
public class Jobs {
    private Integer id;
    private  Integer jeid;
    private String ename;
    private String jname;
    private String location;
    private  String salary;
    private  String requirement;
    private  String detail;
    private  String contect;

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJeid() {
        return jeid;
    }

    public void setJeid(Integer jeid) {
        this.jeid = jeid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }



    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getContect() {
        return contect;
    }

    public void setContect(String contect) {
        this.contect = contect;
    }
}
