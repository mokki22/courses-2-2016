package com.courses.spalah.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Сергей on 28.07.2016.
 */
public class Serialization {
    public static void main(String[] args) {

       String filename = "carparking.ser";

        if(args.length > 0){
            filename = args[0];
        }
        CarParking adress = new CarParking();
        CarParking parkingName = new CarParking();
        CarParking cars[] = new CarParking[0];

        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try
            {
                   fos = new FileOutputStream(filename);
                   out = new ObjectOutputStream(fos);
                   out.writeObject(adress);
                   out.writeObject(parkingName);
                   out.writeObject(cars);
                   out.close();
            }
            catch(IOException ex)
             {
                   ex.printStackTrace();
             }

    }
}
