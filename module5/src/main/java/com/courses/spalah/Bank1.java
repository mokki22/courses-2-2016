package com.courses.spalah;

/**
 * Created by Сергей on 25.07.2016.
 */
public class Bank1
{
    private double startSum;
    private float procent;
    private String name;

    public Bank1(double startSum, float procent, String name)
    {
        this.startSum = startSum;
        this.procent = procent;
        this.name = name;
    }

    public double FinalSum(float years){

        return  (startSum * procent / 100) * years;
    }

    public double getStartSum(){
        return startSum;
    }
    public float getProcent(){
        return procent;
    }
    public String getName(){
        return name;
    }
}
