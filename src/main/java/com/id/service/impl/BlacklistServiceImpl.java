package com.id.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface BlacklistServiceImpl {
    public List<Map<String, Object>> getListBlacklistByUserid(int userid);

    public boolean insertOneBlacklist(int userid, int attentionuserid);

    public boolean deleteOneBlacklist(int userid, int attentionuserid);
}
