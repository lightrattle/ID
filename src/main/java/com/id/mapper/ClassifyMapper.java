package com.id.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ClassifyMapper {
    public List<Map<String, Object>> getListClassify();

    public boolean insertOneClassify(String classifyname);

    public boolean deleteOneClassify(String classifyname);
}
