package com.lyy.servicea.service.Impl;

import com.lyy.servicea.dao.UserDao;
import com.lyy.servicea.entity.User;
import com.lyy.servicea.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;
    @Override
    public List<User> queryAll() {
        return dao.queryAll();
    }
}
