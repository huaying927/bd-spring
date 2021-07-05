package com.delong.spring.ioc.dependencies.method_injection.lookup_method_injection;


public abstract class AbstractRandomNumber
{
    private RandomNumber randomNumber;

    public void setRandomNumber (RandomNumber randomNumber)
    {
        this.randomNumber = randomNumber;
    }

    public RandomNumber getRandomNumber ()
    {
        return this.randomNumber;
    }


    public abstract RandomNumber createRandomNumber ();
}
