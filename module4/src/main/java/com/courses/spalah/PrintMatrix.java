package com.courses.spalah;

/**
 * @author Ievgen Tararaka
 */
public class PrintMatrix {
    /**
     * Написать программу, печатает двумерный массив заданного размера
     * квадратом и 4-мя треугольниками.
     *
     * Входные параметры программы:
     * 1. Размер массива
     * 2. Символ для печати
     *
     * Пример
     * Размер массива - 5
     * Символ для печати - #
     * <p>
     * # # # # #
     * # # # # #
     * # # # # #
     * # # # # #
     * # # # # #
     * <p>
     * #
     * # #
     * # # #
     * # # # #
     * # # # # #
     * <p>
     * # # # # #
     * # # # #
     * # # #
     * # #
     * #
     * <p>
     *         #
     *       # #
     *     # # #
     *   # # # #
     * # # # # #
     * <p>
     * # # # # #
     *   # # # #
     *     # # #
     *       # #
     *         #
     * @param args - размер массива
     */
    public static void main(String[] args) {
        int k = 10;
        String s = "# ";
// квадрат
        for (int i = 0; i < 10; i ++){
            for (int j = 0; j < 10; j++){
                System.out.print(s);

            }
            System.out.println();
        }

        System.out.println();
// треугольник 1
        for (int i = 0; i < 10; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(s);
            }
            System.out.println();
        }

        System.out.println();
// треугольник 2
        for (int i = 0; i < 10; i++){
            for (int j = 10; j > i; j--){
                System.out.print(s);
            }
            System.out.println();
        }
// треугольник 3
        int count = 1;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k - count; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < count; j++) {
                System.out.print(s+"\t");
            }
            System.out.println();
            count++;
    }

}
}
