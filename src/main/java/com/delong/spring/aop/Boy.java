package com.delong.spring.aop;

import org.springframework.stereotype.Component;

@Component("boy")
public class Boy implements IBuy
{
    @Override
    public String buy ()
    {
        System.out.println("男孩买了一个游戏机");

        return "游戏机";
    }
}
