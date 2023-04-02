package com.id.service;

import com.id.mapper.ClassifyMapper;
import com.id.service.impl.ClassifyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassifyService implements ClassifyServiceImpl {
    @Autowired
    ClassifyMapper classifyMapper;


}
