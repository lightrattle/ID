package com.id.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AttentionMapper {
    public List<Map<String, Object>> getListAttentionByUserid(int userid);

    public Map<String, Object> judgeAttention(int userid, String nowimageusername);

    public boolean insertOneAttention(int userid, String nowimageusername);

    public boolean deleteOneAttention(int userid, String nowimageusername);

}
