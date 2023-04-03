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
    public boolean insertOneBlacklist(int userid, int attentionuserid) {
        return blacklistMapper.insertOneBlacklist(userid, attentionuserid);
    }

    @Override
    public boolean deleteOneBlacklist(int userid, int attentionuserid) {
        return blacklistMapper.deleteOneBlacklist(userid, attentionuserid);
    }
}