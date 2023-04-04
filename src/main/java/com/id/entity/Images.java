package com.id.entity;

import org.apache.poi.hpsf.Blob;

import java.util.Date;

public class Images {
    private int imageid;
    private int userid;
    private int classifyid;
    private Date uptime;
    private String image;

    private int status;

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getClassifyid() {
        return classifyid;
    }

    public void setClassifyid(int classifyid) {
        this.classifyid = classifyid;
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
