package com.id.service.impl;

import com.id.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserServiceImpl {
    User loginUser (String username, String password);
    boolean createUser (String nickname, String username, String password);
}
