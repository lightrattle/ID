package com.id.service;

import com.id.mapper.NoticesMapper;
import com.id.service.impl.NoticesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class NoticesService implements NoticesServiceImpl {
    @Autowired
    NoticesMapper noticesMapper;

    @Override
    public List<Map<String, Object>> getNoticeListByUserid(int userid) {
        return noticesMapper.getNoticeListByUserid(userid);
    }

    @Override
    public List<Map<String, Object>> getNoticeListByUseridAndNotRead(int userid) {
        return noticesMapper.getNoticeListByUseridAndNotRead(userid);
    }

    @Override
    public List<Map<String, Object>> getNoticeListByUseridAndReaded(int userid) {
        return noticesMapper.getNoticeListByUseridAndReaded(userid);
    }

    @Override
    public boolean insertOneNotice(int userid, Date noticetime, String notice) {
        return noticesMapper.insertOneNotice(userid, noticetime, notice);
    }

    @Override
    public boolean updateStatus(int userid, int noticeid) {
        return noticesMapper.updateStatus(userid, noticeid);
    }

    @Override
    public boolean deleteOneNotice(int noticeid) {
        return noticesMapper.deleteOneNotice(noticeid);
    }
}
