package com.id.service;

import com.id.mapper.AttentionMapper;
import com.id.service.impl.AttentionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttentionService implements AttentionServiceImpl {
    @Autowired
    AttentionMapper attentionMapper;


}
