package com.delong.spring.ioc.dependencies.dependencies_and_configuration_in_detail.compound_property_names;

public class Employee
{
    private String name;
    private Address address;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public Address getAddress ()
    {
        return address;
    }

    public void setAddress (Address address)
    {
        this.address = address;
    }

    public void printWorkInfo()
    {
        System.out.println(this.name + " 上班的地址在" + this.getAddress().getCompanyAddr());
    }
}
