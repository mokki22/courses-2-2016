package com.courses.spalah;

import com.sun.org.apache.bcel.internal.generic.FLOAD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ievgen Tararaka
 */
public class Calculator {
    public static void main(String[] args) {

        System.out.println("Start calculator");

        Float number1 = 0.0F;
        String operator = "";
        Float number2 = 0.0F;
        float prev = 0.0F;
        float result = 0.0F;
        while(true) {
            String[] numbers = readFromConsole();
            if(numbers[0].equals("exit"))
                break;

            if (numbers.length == 3) {
                number1 = Float.parseFloat(numbers[0]);
                number2 = Float.parseFloat(numbers[2]);
                operator = numbers[1];
            }

            if (numbers.length == 2) {
                number1 = prev;
                number2 = Float.parseFloat(numbers[1]);
                operator = numbers[0];
            }
            result = culc(number1, number2, operator);
            prev = result;
            System.out.println(result);
        }
    }

    public static float culc(float a, float b, String operator) {
        float result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }
        return result;
    }

    public static String[] readFromConsole() {
        try {
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            String input = bufferRead.readLine();
            return input.split("\\s");
        } catch (IOException e) {
            return new String[]{""};
        }
    }
}
