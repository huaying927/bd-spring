package com.delong.spring.ioc.dependencies.dependencies_and_configuration_in_detail.collections.collection_merge;

import java.util.List;

public abstract class SuperCollection
{
    private List list;

    public void setList (List list)
    {
        this.list = list;
    }
}
