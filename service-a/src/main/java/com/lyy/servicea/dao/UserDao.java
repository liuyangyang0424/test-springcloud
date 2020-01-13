package com.lyy.servicea.dao;

import com.lyy.servicea.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> queryAll();
}
