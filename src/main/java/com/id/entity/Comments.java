package com.id.entity;

import java.util.Date;

public class Comments {
    private int commentid;
    private int commentuserid;
    private Date commenttime;
    private int imageid;
    private String comment;

    public int getCommentid() {
        return commentid;
    }

    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }

    public int getCommentuserid() {
        return commentuserid;
    }

    public void setCommentuserid(int commentuserid) {
        this.commentuserid = commentuserid;
    }

    public Date getCommenttime() {
        return commenttime;
    }

    public void setCommenttime(Date commenttime) {
        this.commenttime = commenttime;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
