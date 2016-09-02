package com.courses.spalah.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/**
 * Created by Сергей on 28.07.2016.
 */
public class Deserialization {
    public static void main(String [] args) {

        String filename = "time.ser";
        if (args.length > 0) {
            filename = args[0];
        }
        CarParking adress = null;
        CarParking parkingName = null;
        CarParking cars[] = null;

        FileInputStream fis = null;
        ObjectInputStream in = null;

        try{
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            adress = (CarParking) in.readObject();
            parkingName = (CarParking) in.readObject();
            cars = (CarParking[]) in.readObject();
            in.close();


        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        System.out.println("ADRESS: " + adress);
        System.out.println("PARKINGNAME: : " + parkingName);
        System.out.println("CARS: " + Arrays.toString(cars));

    }
}
