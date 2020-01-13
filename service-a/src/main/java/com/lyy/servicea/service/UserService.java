package com.lyy.servicea.service;

import com.lyy.servicea.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> queryAll();

}
