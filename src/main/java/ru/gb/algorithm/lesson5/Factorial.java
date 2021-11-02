package ru.gb.algorithm.lesson5;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(100000));
    }

    private static long factorial(long n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
