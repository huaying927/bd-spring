package com.delong.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class UserDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addUser(User user)
    {
        String sql = "INSERT INTO `t_user`(user_name) VALUES(?);";
        String username = UUID.randomUUID().toString().substring(0, 5);
        jdbcTemplate.update(sql,user.getUserName());
    }
}
