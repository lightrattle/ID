package com.id.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Mapper
public interface ImagesMapper {
    public List<Map<String, Object>> getImagesListByUserid(int userid);

    public List<Map<String, Object>> getImagesListByClassifyid(int classifyid);

    public boolean insertOneImage(int userid, int classifyid, Date uptime, String image);

    public boolean deleteOneImage(int imageid);
}
