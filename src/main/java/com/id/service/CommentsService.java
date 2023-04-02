package com.id.service;

import com.id.mapper.CommentsMapper;
import com.id.service.impl.CommentsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentsService implements CommentsServiceImpl {
    @Autowired
    CommentsMapper commentsMapper;


}
