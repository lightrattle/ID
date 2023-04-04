package com.id.service.impl;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public interface ImagesServiceImpl {

    public List<Map<String, Object>> getImagesListAll();
    public List<Map<String, Object>> getImagesListByUserid(int userid);

    public List<Map<String, Object>> getImagesListByClassifyname(String classifyname);

    public List<Map<String, Object>> getOneImage(int imageid);

    public boolean insertOneImage(int userid, int classifyid, Date uptime, String image);

    public boolean deleteOneImage(int imageid);

    public boolean updatestatus(int imageid);

    public boolean updateclassify(int imageid, int classifyid);
}
