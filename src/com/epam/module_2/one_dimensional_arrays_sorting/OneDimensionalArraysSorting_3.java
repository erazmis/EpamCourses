/**
 * Сортировка выбором. Дана последовательность чисел. Требуется переставить элементы так,
 * чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором.
 */

package com.epam.module_2.one_dimensional_arrays_sorting;

import java.util.Random;

public class OneDimensionalArraysSorting_3 {

    private static final int SIZE = 10;

    public static void main(String[] args) {
        int[] array = new int[SIZE];
        createArray(array);

        printArray(array);

        sortArray(array);

        printArray(array);
    }

    private static void createArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(5);
        }
    }

    private static void printArray(int[] array) {
        System.out.println("Array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    private static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = -1;
            int maxIndex = 0;
            for (int j = i; j < array.length; j++) {
                if (max < array[j]) {
                    max = array[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int replacer = array[i];
                array[i] = array[maxIndex];
                array[maxIndex] = replacer;
            }

        }
    }
}
