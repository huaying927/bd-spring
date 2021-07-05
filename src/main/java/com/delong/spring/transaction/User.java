package com.delong.spring.transaction;

import java.util.Objects;

public class User
{
    private int id;

    private String userName;

    private int age;

    public User ()
    {
    }

    public User (int id, String userName, int age)
    {
        this.id = id;
        this.userName = userName;
        this.age = age;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public String getUserName ()
    {
        return userName;
    }

    public void setUserName (String userName)
    {
        this.userName = userName;
    }

    public int getAge ()
    {
        return age;
    }

    public void setAge (int age)
    {
        this.age = age;
    }

    @Override
    public boolean equals (Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        User user = (User) o;
        return id == user.id && age == user.age && Objects.equals(userName, user.userName);
    }

    @Override
    public int hashCode ()
    {
        return Objects.hash(id, userName, age);
    }

    @Override
    public String toString ()
    {
        return "User{" + "id=" + id + ", userName='" + userName + '\'' + ", age=" + age + '}';
    }
}
