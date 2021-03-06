// Вычислить произведение квадратов первых двухсот чисел
package com.epam.module_1.cycles;

import java.math.BigInteger;

public class Cycles_4 {

    public static void main(String[] args) {
        BigInteger product = BigInteger.valueOf(1);
        BigInteger sqrI;

        for (int i = 1; i < 201; i++) {
            sqrI = BigInteger.valueOf(i * i);
            product = product.multiply(sqrI);
        }

        System.out.print("Произведение квадратов первых 200 чисел равно " + product);
    }
}
