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

    public List<Map<String, Object>> getImagesListByClassifynameAndZan(String classifyname);
    public List<Map<String, Object>> getImagesListByNotshenhe();

    public List<Map<String, Object>> getOneImage(int imageid);

    public boolean insertOneImage(int userid, int classifyid, Date uptime, String image);

    public boolean deleteOneImage(int imageid);

    public boolean updatestatus(int imageid, String classifyname);

    public int getZanByImageid(int imageid);

    public boolean setZanByImageid(int imageid);

    public int getCaiByImageid(int imageid);

    public boolean setCaiByImageid(int imageid);

}
