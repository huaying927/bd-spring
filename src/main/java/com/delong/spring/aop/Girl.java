package com.delong.spring.aop;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;

@Component("girl")
public class Girl implements IBuy
{
    @Override
    public String buy ()
    {
//        try (FileInputStream fileInputStream = new FileInputStream(new File("a.txt")))
//        {
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }

        System.out.println("女孩买了一件漂亮的衣服");

        return "衣服";
    }

    public void buy (String username)
    {
        System.out.println(username +  "女孩买了一件漂亮的衣服");

    }

//    public void test (String name)
//    {
//        System.out.println(name +  "女孩买了一件漂亮的衣服");
//
//    }
}
