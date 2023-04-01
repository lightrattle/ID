package com.id.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ClassfilyMapper {
    public List<Map<String, Object>> getListClassfily();

    public boolean insertOneClassfily(String classfilyname);

    public boolean deleteOneClassfily(String classfilyname);
}
