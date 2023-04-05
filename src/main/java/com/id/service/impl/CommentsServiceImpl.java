package com.id.service.impl;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public interface CommentsServiceImpl {
    public List<Map<String, Object>> getListCommentsByImageid(int imageid);

    public List<Map<String, Object>> getListCommentsByUserid(int userid);

    public List<Map<String, Object>> getListCommentsByExcludeBlacklist(int imageid, int userid);

    public boolean canInsertOne(int commentuserid, String imageusername);

    public boolean insertOneComment(int commentuserid, Date commenttime, int imageid, String comment);

    public boolean deleteOneComment(int commentuserid, int imageid, String comment);
}
