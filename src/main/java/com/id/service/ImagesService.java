package com.id.service;

import com.id.mapper.ImagesMapper;
import com.id.service.impl.ImagesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagesService implements ImagesServiceImpl {
    @Autowired
    ImagesMapper imagesMapper;


}
