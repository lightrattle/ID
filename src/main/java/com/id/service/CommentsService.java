package com.id.service;

import com.id.mapper.CommentsMapper;
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

    @Override
    public List<Map<String, Object>> getListCommentsByImageid(int imageid) {
        return commentsMapper.getListCommentsByImageid(imageid);
    }

    @Override
    public List<Map<String, Object>> getListCommentsByUserid(int userid) {
        return commentsMapper.getListCommentsByUserid(userid);
    }

    @Override
    public boolean insertOneComment(int commentuserid, Date commenttime, int imageid, String comment) {
        return commentsMapper.insertOneComment(commentuserid, commenttime, imageid, comment);
    }

    @Override
    public boolean deleteOneComment(int commentuserid, int imageid, String comment) {
        return commentsMapper.deleteOneComment(commentuserid, imageid, comment);
    }
}
