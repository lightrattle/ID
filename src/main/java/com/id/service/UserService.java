package com.id.service;

import com.id.entity.User;
import com.id.mapper.UserMapper;
import com.id.service.impl.UserServiceImpl;
import org.apache.ibatis.annotations.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceImpl {
    @Autowired
    UserMapper userMapper;

    @Override
    public User loginUser (String username, String password){
        return userMapper.loginUser(username, password);
    }

    @Override
    public boolean createUser (String nickname, String username, String password){
        return userMapper.createUser(nickname, username, password);
    }

    @Override
    public int usernametouserid(String username) {
        return userMapper.usernametouserid(username);
    }

    @Override
    public int doanswer(int userid, int cho1, int cho2, int cho3, int cho4, int cho5) {
        int[] answers = {cho1, cho2, cho3, cho4, cho5};
        int score = 0;
        if(answers[0] == 1){
            score+= 20;
        }
        if(answers[1] == 3){
            score+= 20;
        }
        if(answers[2] == 2){
            score+= 20;
        }
        if(answers[3] == 0){
            score+= 20;
        }
        if(answers[4] == 2){
            score+= 20;
        }
        if(score>= 80){
            return userMapper.setstatus(userid)?1:-1;
        }
        else return 0;
    }
}
