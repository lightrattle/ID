package com.id.service;

import com.id.mapper.BlacklistMapper;
import com.id.service.impl.BlacklistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlacklistService implements BlacklistServiceImpl {
    @Autowired
    BlacklistMapper blacklistMapper;


}