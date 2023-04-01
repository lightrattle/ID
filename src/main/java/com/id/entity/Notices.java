package com.id.entity;

import java.util.Date;

public class Notices {
    private int noticeid;
    private int userid;
    private Date noticetime;
    private int status;
    private String notice;

    public int getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(int noticeid) {
        this.noticeid = noticeid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public Date getNoticetime() {
        return noticetime;
    }

    public void setNoticetime(Date noticetime) {
        this.noticetime = noticetime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }
}
