package ru.gb.algorithm.lesson5;


public class Homework5 {
    public static void main(String[] args) {
        System.out.println(power(3L,3));
        System.out.println(knapsack(values.length - 1, W));
    }
    // метод возведения числа в степень
    public static Long power(Long value, Integer degree) {
        if (degree == 1) { return value; }
        else {
            return value * power(value, --degree);
        }
    }

//    int knapsackRec(int[] w, int[] v, int n, int W) {
//        if (n  W) {
//            return knapsackRec(w, v, n - 1, W);
//        }
//        else {
//            return Math.max(knapsackRec(w, v, n - 1, W), v[n - 1] + knapsackRec(w, v, n - 1, W - w[n - 1]));
//        }
//    }

    static int[] values = new int[] {3000, 2000, 1500};
    static int[] weights = new int[] {30, 20, 15};
    static int W = 35;

    private static int knapsack(int i, int W) {
        if (i < 0) {
            return 0;
        }
        if (weights[i] > W) {
            return knapsack(i-1, W);
        } else {
            return Math.max(knapsack(i-1, W), knapsack(i-1, W - weights[i]) + values[i]);
        }
    }



}
