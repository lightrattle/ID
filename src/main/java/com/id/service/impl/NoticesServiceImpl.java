package com.id.service.impl;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public interface NoticesServiceImpl {
    public List<Map<String, Object>> getNoticeListByUserid(int userid);

    public List<Map<String, Object>> getNoticeListByUseridAndNotRead(int userid);

    public List<Map<String, Object>> getNoticeListByUseridAndReaded(int userid);

    public boolean insertOneNotice(int userid, Date noticetime, String notice);

    public boolean updateStatus( int userid, int noticeid);

    public boolean deleteOneNotice(int noticeid);
}
