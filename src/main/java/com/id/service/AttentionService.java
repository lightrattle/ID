package com.id.service;

import com.id.mapper.AttentionMapper;
import com.id.service.impl.AttentionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AttentionService implements AttentionServiceImpl {
    @Autowired
    AttentionMapper attentionMapper;

    @Override
    public List<Map<String, Object>> getListAttentionByUserid(int userid) {
        return attentionMapper.getListAttentionByUserid(userid);
    }

    @Override
    public int judgeAttention(int userid, String nowimageusername) {
        return attentionMapper.judgeAttention(userid, nowimageusername) !=null?0:1;
    }

    @Override
    public boolean insertOneAttention(int userid, String nowimageusername) {
        return attentionMapper.insertOneAttention(userid, nowimageusername);
    }

    @Override
    public boolean deleteOneAttention(int userid, String nowimageusername) {
        return attentionMapper.deleteOneAttention(userid, nowimageusername);
    }
}
