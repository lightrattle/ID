package com.id.service;

import com.id.mapper.BlacklistMapper;
import com.id.service.impl.BlacklistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BlacklistService implements BlacklistServiceImpl {
    @Autowired
    BlacklistMapper blacklistMapper;

    @Override
    public List<Map<String, Object>> getListBlacklistByUserid(int userid) {
        return blacklistMapper.getListBlacklistByUserid(userid);
    }

    @Override
    public int judgeBlacklist(int userid, String nowimageusername) {
        return blacklistMapper.judgeBlacklist(userid, nowimageusername) !=null?0:1;
    }

    @Override
    public boolean insertOneBlacklist(int userid, String nowimageusername) {
        boolean res = blacklistMapper.insertOneBlacklist(userid, nowimageusername);
        blacklistMapper.deleteFromAttention(userid, nowimageusername);
        return res;
    }

    @Override
    public boolean deleteOneBlacklist(int userid, String nowimageusername) {
        return blacklistMapper.deleteOneBlacklist(userid, nowimageusername);
    }
}