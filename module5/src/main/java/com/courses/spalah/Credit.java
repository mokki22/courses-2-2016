package com.courses.spalah;

/**
 * Created by Сергей on 25.07.2016.
 */
public class Credit {

    private float sumOfCredit;
    private double procentPerYear;
    private int years;


    public float getSumOfCredit() {
        return sumOfCredit;
    }

    public double getProcentPerYear() {
        return procentPerYear;
    }

    public void setProcentPerYear(double procentPerYear) {
        this.procentPerYear = procentPerYear;
    }

    public float getYears() {
        return years;
    }

    public Credit(float sumOfCredit, double procentPerYear, int years) {

        this.sumOfCredit = sumOfCredit;
        this.procentPerYear = procentPerYear;
        this.years = years;
    }

    public double FinalSum(float years){

        return  sumOfCredit * (procentPerYear / 100) * years;
    }
}