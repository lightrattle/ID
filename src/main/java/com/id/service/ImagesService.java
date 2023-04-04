package com.id.service;

import com.id.mapper.ImagesMapper;
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
    public boolean updatestatus(int imageid) {
        return imagesMapper.updatestatus(imageid);
    }

    @Override
    public boolean updateclassify(int imageid, int classifyid) {
        return imagesMapper.updateclassify(imageid,classifyid);
    }
}