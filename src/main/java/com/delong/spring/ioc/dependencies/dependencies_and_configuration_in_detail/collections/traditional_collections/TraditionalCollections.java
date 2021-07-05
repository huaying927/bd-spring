package com.delong.spring.ioc.dependencies.dependencies_and_configuration_in_detail.collections.traditional_collections;

import java.util.*;

public class TraditionalCollections
{
    private String[] strArr;
    private List list;
    private Set set;
    private Map map;
    private Properties properties;

    public void setStrArr (String[] strArr)
    {
        this.strArr = strArr;
    }

    public void setList (List list)
    {
        this.list = list;
    }

    public void setSet (Set set)
    {
        this.set = set;
    }

    public void setMap (Map map)
    {
        this.map = map;
    }

    public void setProperties (Properties properties)
    {
        this.properties = properties;
    }

    public void printArray ()
    {
        System.out.println("Arrays.toString(this.strArr) = " + Arrays.toString(this.strArr));
    }

    public void printList ()
    {
        System.out.println("this.list = " + this.list);
    }

    public void printSet ()
    {
        System.out.println("this.set = " + this.set);
    }

    public void printMap ()
    {
        System.out.println("this.map = " + this.map);
    }

    public void printProperties()
    {
        System.out.println("this.properties = " + this.properties);
    }
}
