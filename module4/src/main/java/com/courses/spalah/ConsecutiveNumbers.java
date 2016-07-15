package com.courses.spalah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Ievgen Tararaka
 */
public class ConsecutiveNumbers {
    /**
     * Написать программу, которая отвечает на вопрос:
     * "Содержит ли введенная строка правильную последовательность цифр?"
     *
     * Входные параметры программы:
     * 1. Строка с числами (только целые числа, которые не больше, чем int)
     * 2. Разделительный символ для этой строки. Разделительный символ в строке может быть любой, пустой в том числе.
     *
     * Например:
     * Строка - 1*2*3*6*7
     * Символ - *
     * Ответ - false
     *
     * @param args - аргументы коммандной строки
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("String with numbers ");
        String numbers = bufferRead.readLine();

        System.out.println("Separate symbol ");
        String symbol = bufferRead.readLine();

        if ("*".equals(symbol)) {
            symbol = "\\*";
        }
        if (" ".equals(symbol)) {
            symbol = " ";
        }
        String[] finalNumbers = numbers.split(symbol);

        boolean result = false;
        for (int i = finalNumbers.length - 1; i > 0; i--) {
            if (Integer.parseInt(finalNumbers[i]) - Integer.parseInt(finalNumbers[i - 1]) == 1) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        System.out.println(result);

    }
    }

