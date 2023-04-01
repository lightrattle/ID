package com.id.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface CommentsMapper {
    public List<Map<String, Object>> getListCommentsByImageid(int imageid);

    public List<Map<String, Object>> getListCommentsByUserid(int userid);

    public boolean insertOneComment(int commentuserid, Date commenttime, int imageid, String comment);

    public boolean deleteOneComment(int commentuserid, int imageid, String comment);
}
