package com.id.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Mapper
public interface ImagesMapper {
    public List<Map<String, Object>> getImagesListAll();
    public List<Map<String, Object>> getImagesListByUserid(int userid);

    public List<Map<String, Object>> getImagesListByClassifyname(String classifyname);

    public List<Map<String, Object>> getImagesListByClassifynameAndZan(String classifyname);
    public List<Map<String, Object>> getImagesListByNotshenhe();

    public List<Map<String, Object>> getOneImage(int imageid);

    public boolean insertOneImage(int userid, int classifyid, Date uptime, String image);

    public boolean deleteOneImage(int imageid);

    public boolean updatestatus(int imageid, String classifyname);

    public int getUseridByImageid(int imageid);

    public Date getUptimeByImageid(int imageid);

    public int getZanByImageid(int imageid);

    public boolean setZanByImageid(int imageid);

    public int getCaiByImageid(int imageid);

    public boolean setCaiByImageid(int imageid);

}
