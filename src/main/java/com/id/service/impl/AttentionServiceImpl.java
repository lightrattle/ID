package com.id.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface AttentionServiceImpl {
    public List<Map<String, Object>> getListAttentionByUserid(int userid);

    public boolean insertOneAttention(int userid, int attentionuserid);

    public boolean deleteOneAttention(int userid, int attentionuserid);
}
