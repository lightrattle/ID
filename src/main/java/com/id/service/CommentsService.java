package com.id.service;

import com.id.mapper.CommentsMapper;
import com.id.mapper.ImagesMapper;
import com.id.mapper.NoticesMapper;
import com.id.service.impl.CommentsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CommentsService implements CommentsServiceImpl {
    @Autowired
    CommentsMapper commentsMapper;
    @Autowired
    NoticesMapper noticesMapper;
    @Autowired
    ImagesMapper imagesMapper;

    @Override
    public List<Map<String, Object>> getListCommentsByImageid(int imageid) {
        return commentsMapper.getListCommentsByImageid(imageid);
    }

    @Override
    public List<Map<String, Object>> getListCommentsByUserid(int userid) {
        return commentsMapper.getListCommentsByUserid(userid);
    }

    @Override
    public List<Map<String, Object>> getListCommentsByExcludeBlacklist(int imageid, int userid) {
        return commentsMapper.getListCommentsByExcludeBlacklist(imageid, userid);
    }

    @Override
    public boolean canInsertOne(int commentuserid, String imageusername) {
        if(commentsMapper.canInsertOne(commentuserid, imageusername) != null){
            return false;
        }
        else return true;
    }

    @Override
    public boolean insertOneComment(int commentuserid, Date commenttime, int imageid, String comment) {
        //get userid
        int userid = imagesMapper.getUseridByImageid(imageid);
        String notice = "有与你相关新的评论 from时间：" + commenttime + "_" + imageid;
        noticesMapper.insertOneNotice(userid, commenttime, notice);
        return commentsMapper.insertOneComment(commentuserid, commenttime, imageid, comment);
    }

    @Override
    public boolean deleteOneComment(int commentuserid, int imageid, String comment) {
        return commentsMapper.deleteOneComment(commentuserid, imageid, comment);
    }
}
