package com.delong.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService
{
    @Autowired
    private UserDao userDao;

    @Transactional
    public void addUser(User user)
    {
        this.userDao.addUser(user);

//        System.out.println("10 / 0 = " + 10 / 0);
    }
}
