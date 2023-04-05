package com.id.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BlacklistMapper {
    public List<Map<String, Object>> getListBlacklistByUserid(int userid);

    public Map<String, Object> judgeAttention(int userid, String nowimageusername);
    public boolean insertOneBlacklist(int userid, String nowimageusername);

    public boolean deleteOneBlacklist(int userid, String nowimageusername);
}
