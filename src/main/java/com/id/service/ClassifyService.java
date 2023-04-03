package com.id.service;

import com.id.mapper.ClassifyMapper;
import com.id.service.impl.ClassifyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ClassifyService implements ClassifyServiceImpl {
    @Autowired
    ClassifyMapper classifyMapper;

    @Override
    public List<Map<String, Object>> getListClassify() {
        return classifyMapper.getListClassify();
    }

    @Override
    public boolean insertOneClassify(String classifyname) {
        return classifyMapper.insertOneClassify(classifyname);
    }

    @Override
    public boolean deleteOneClassify(String classifyname) {
        return classifyMapper.deleteOneClassify(classifyname);
    }
}
