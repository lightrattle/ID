package com.id.mapper;

import java.util.List;
import java.util.Map;

public interface ClassfilyMapper {
    public List<Map<String, Object>> getListClassfily();

    public boolean insertOneClassfily(String classfilyname);

    public boolean deleteOneClassfily(String classfilyname);
}
