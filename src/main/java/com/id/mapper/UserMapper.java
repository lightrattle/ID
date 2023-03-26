package com.id.mapper;


import com.id.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {
    User loginUser (String username, String password);
    boolean createUser (String nickname,String username,String password);
}
