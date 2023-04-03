package com.id.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface ClassifyServiceImpl {
    public List<Map<String, Object>> getListClassify();

    public boolean insertOneClassify(String classifyname);

    public boolean deleteOneClassify(String classifyname);
}
