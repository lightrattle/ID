package com.id.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface AttentionServiceImpl {
    public List<Map<String, Object>> getListAttentionByUserid(int userid);

    public int judgeAttention(int userid, String nowimageusername);

    public boolean insertOneAttention(int userid, String nowimageusername);

    public boolean deleteOneAttention(int userid, String nowimageusername);
}
