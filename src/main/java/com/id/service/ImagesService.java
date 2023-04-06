package com.id.service;

import com.id.mapper.AttentionMapper;
import com.id.mapper.ImagesMapper;
import com.id.mapper.NoticesMapper;
import com.id.mapper.UserMapper;
import com.id.service.impl.ImagesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ImagesService implements ImagesServiceImpl {
    @Autowired
    ImagesMapper imagesMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    AttentionMapper attentionMapper;
    @Autowired
    NoticesMapper noticesMapper;

    @Override
    public List<Map<String, Object>> getImagesListAll() {
        return imagesMapper.getImagesListAll();
    }

    @Override
    public List<Map<String, Object>> getImagesListByUserid(int userid) {
        return imagesMapper.getImagesListByUserid(userid);
    }

    @Override
    public List<Map<String, Object>> getImagesListByClassifyname(String classifyname) {
        return imagesMapper.getImagesListByClassifyname(classifyname);
    }

    @Override
    public List<Map<String, Object>> getImagesListByNotshenhe() {
        return imagesMapper.getImagesListByNotshenhe();
    }

    @Override
    public List<Map<String, Object>> getOneImage(int imageid) {
        return imagesMapper.getOneImage(imageid);
    }

    @Override
    public boolean insertOneImage(int userid, int classifyid, Date uptime, String image) {
        return imagesMapper.insertOneImage(userid, classifyid, uptime, image);
    }

    @Override
    public boolean deleteOneImage(int imageid) {
        return imagesMapper.deleteOneImage(imageid);
    }

    @Override
    public boolean updatestatus(int imageid, String classifyname) {
        int userid = imagesMapper.getUseridByImageid(imageid);
        String nickname = userMapper.getNicknameByUserid(userid);
        String notice = "关注的用户发布新的图片了！ @" + nickname;
        Date uptime = imagesMapper.getUptimeByImageid(imageid);
        //get all connected userid
        List<Map<String, Object>> useridList = attentionMapper.getUseridByAttentionuserid(userid);
        for (Map<String, Object> map : useridList) {
            for (Map.Entry<String, Object> m : map.entrySet()) {
                noticesMapper.insertOneNotice((int)m.getValue(), uptime, notice);
            }
        }
        return imagesMapper.updatestatus(imageid, classifyname);
    }
}
