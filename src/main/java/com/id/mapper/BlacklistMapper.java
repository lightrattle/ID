package com.id.mapper;

import java.util.List;
import java.util.Map;

public interface BlacklistMapper {
    public List<Map<String, Object>> getListBlacklistByUserid(int userid);

    public boolean insertOneBlacklist(int userid, int attentionuserid);

    public boolean deleteOneBlacklist(int userid, int attentionuserid);

}