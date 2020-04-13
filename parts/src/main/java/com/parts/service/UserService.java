package com.parts.service;

import com.parts.dao.UserDao;
import com.parts.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Dmarco
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserById(Long id){
        return userDao.getUserById(id);
    }

    public List<User> listUser(){
        return userDao.listUser();
    }
}
