package com.ssm.services.impl;

import com.ssm.dao.UserDao;
import com.ssm.model.User;
import com.ssm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
   @Autowired
    private UserDao userDao;
    @Override
    public void insert(User user) {
        userDao.insert(user);
    }
}
