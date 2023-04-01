package com.id.entity;

import org.apache.poi.hpsf.Blob;

import java.util.Date;

public class Images {
    private int imageid;
    private int userid;
    private int classifyid;
    private Date uptime;
    private Blob image;

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

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }
}
