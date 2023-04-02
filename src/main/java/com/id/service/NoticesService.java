package com.id.service;

import com.id.mapper.NoticesMapper;
import com.id.service.impl.NoticesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticesService implements NoticesServiceImpl {
    @Autowired
    NoticesMapper noticesMapper;


}
