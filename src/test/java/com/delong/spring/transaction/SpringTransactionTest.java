package com.delong.spring.transaction;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTransactionTest
{
    @Test
    public void testTransaction()
    {
        //1.创建applicationContext
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);


        final User user = new User();
        user.setUserName("big-data222");

        UserService userService = applicationContext.getBean(UserService.class);

        userService.addUser(user);

//        NamedParameterJdbcTemplate
        applicationContext.close();
    }
}
