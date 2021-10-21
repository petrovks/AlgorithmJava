package ru.gb.algorithm.lesson1;


import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

public class Lesson1 {
    //  Определить сложность следующих алгоритмов:
    //    -. Поиск элемента массива с известным индексом    -    O(1)
    //  -. Дублирование одномерного массива через foreach   -   O(n)
    //  -. Удаление элемента массива с известным индексом без сдвига
    //   Удалить элеиент массива можно путем записи в элемнет значение 0  -   O(1)
    //   Если удалить элемент с созданием нового массива  - О(n)
    //  -. Удаление элемента массива с неизвестным индексом без сдвига  -  O(n)
//      -. Удаление элемента массива с неизвестным индексом со сдвига  -  O(n)
//.


    //   3. Определить сложность следующих алгоритмов. Сколько произойдет итераций?
    //          a)



    public void test1(){
        int n = 10000;
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j *= 2) {
                arrayList.add(i * j);           // O(n * log n)
            }
        }
        // b)

        arrayList.clear();

        for (int i = 0; i < n; i += 2) {
            for (int j = i; j < n; j++) {       //O(n/2 * n)
                arrayList.add(i * j);
            }
        }
        // с)

        arrayList.clear();

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j++) {         //O(n^2)
                arrayList.add(i * j);
                n--;
            }
        }
        //   d)
        //       ```

        factorial(BigInteger.valueOf(10000));

        fib(BigInteger.valueOf(50));

    }



    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {                     // O(n!)
            return n;
        }
        return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
    }

    //   e)


    public static BigInteger fib(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return BigInteger.ZERO;
        }                                                   //O(2^n)
        if (n.equals(BigInteger.TWO)) {
            return BigInteger.ONE;
        }
        return fib(n.subtract(BigInteger.ONE)).add(fib(n.subtract(BigInteger.TWO)));
    }


}
