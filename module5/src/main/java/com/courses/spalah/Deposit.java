package com.courses.spalah;

/**
 * Created by Сергей on 25.07.2016.
 */
public class Deposit
{
    private double sum;
    private float procent;
    private String name;

    public Deposit(double sum, float procent, String name)
    {
        this.sum = sum;
        this.procent = procent;
        this.name = name;
    }

    public double FinalSum(float years)
    {
        return  (sum * procent / 100) * years;
    }

    public double getSum(){
        return sum;
    }
    public float getProcent(){
        return procent;
    }
    public String getName(){
        return name;
    }
}
