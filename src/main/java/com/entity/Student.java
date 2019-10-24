package com.entity;

import java.util.Date;

public class Student {
    private Integer id;

    private String name;

    private String password;

    private Integer fenzu;

    private Date time;

    private Integer aaaId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getFenzu() {
        return fenzu;
    }

    public void setFenzu(Integer fenzu) {
        this.fenzu = fenzu;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getAaaId() {
        return aaaId;
    }

    public void setAaaId(Integer aaaId) {
        this.aaaId = aaaId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", fenzu=" + fenzu +
                ", time=" + time +
                ", aaaId=" + aaaId +
                '}';
    }
}