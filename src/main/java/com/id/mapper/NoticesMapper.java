package com.id.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Mapper
public interface NoticesMapper {
    public List<Map<String, Object>> getNoticeListByUserid(int userid);

    public List<Map<String, Object>> getNoticeListByUseridAndNotRead(int userid);

    public List<Map<String, Object>> getNoticeListByUseridAndReaded(int userid);

    public boolean insertOneNotice(int userid, Date commenttime, String notice);

    public boolean updateStatus( int userid, int noticeid);

    public boolean deleteOneNotice(int noticeid);
}
