package com.delong.spring.ioc.dependencies.dependencies_and_configuration_in_detail.collections.strongly_collections;

import java.util.List;

public class StronglyCollections
{
    private List<String> strList;

    public void setStrList (List<String> strList)
    {
        this.strList = strList;
    }

    public void printStringWithList()
    {
        System.out.println("this.strList = " + this.strList);
    }
}
