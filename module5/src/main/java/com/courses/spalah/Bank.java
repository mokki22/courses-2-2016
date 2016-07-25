package com.courses.spalah;

/**
 * Created by Сергей on 25.07.2016.
 */
public class Bank
{
    private String name;
    Deposit deposit1;
    Deposit deposit2;
    Deposit deposit3;

    public Bank(String name)
    {
        deposit3 = new Deposit(25478F, 14F, "NAME1");
        deposit2 = new Deposit(69584F, 25.8F, "NAME2");
        deposit1 = new Deposit(254158F, 6.5F, "NAME3");
        this.name = name;
    }

    public double FinalSum(float years){
        return  deposit1.FinalSum(years) + deposit2.FinalSum(years) + deposit3.FinalSum(years);

    }

    public String getName(){
        return name;
    }
}
