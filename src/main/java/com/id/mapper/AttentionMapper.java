package com.id.mapper;

import java.util.List;
import java.util.Map;

public interface AttentionMapper {
    public List<Map<String, Object>> getListAttentionByUserid(int userid);

    public boolean insertOneAttention(int userid, int attentionuserid);

    public boolean deleteOneAttention(int userid, int attentionuserid);

}
