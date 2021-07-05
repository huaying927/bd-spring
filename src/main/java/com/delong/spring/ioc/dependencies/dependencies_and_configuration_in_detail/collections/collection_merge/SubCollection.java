package com.delong.spring.ioc.dependencies.dependencies_and_configuration_in_detail.collections.collection_merge;

import java.util.List;

public class SubCollection extends SuperCollection
{
    private List list;//父类中属性名和子类中属性名要保持一致

    public void setList (List list)
    {
        this.list = list;
    }

    public void printList()
    {
        System.out.println("this.list = " + this.list);
    }
}
