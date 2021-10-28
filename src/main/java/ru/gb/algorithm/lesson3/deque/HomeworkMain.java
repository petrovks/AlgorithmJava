package ru.gb.algorithm.lesson3.deque;


import ru.gb.algorithm.lesson3.queue.Queue;
import ru.gb.algorithm.lesson4.LinkedDeque;
import ru.gb.algorithm.lesson4.LinkedQueue;

public class HomeworkMain {
    public static void main(String[] args) {

        Deque<Integer> deq = new LinkedDeque<>();

//        insertRight(deq, 1);
//        insertRight(deq, 2);
//        insertRight(deq, 3);
//        insertRight(deq, 4);// 1 2 3 4
//        insertLeft(deq, 5); // 5 1 2 3 4
//        insertLeft(deq, 6); // 6 5 1 2 3 4
//        insertLeft(deq, 7);//full
//        removeLeft(deq); //5 1 2 3 4
//        removeRight(deq); // 5 1 2 3
        deq.insertRight(1);
        deq.insertRight(2);
        deq.insertRight(3);
        deq.insertLeft(4);
        deq.insertRight(5);
        deq.insertRight(6);
        deq.insertRight(7);
        System.out.println("Удалено слева: " + deq.removeLeft());
        System.out.println("Удалено справа: " + deq.removeRight());
//
        deq.display();
   //     displayLeftToRight(deq); // Queue
       // displayRightToLeft(deq); //Stack
    }

    private static <E> void insertRight(Deque<E> deq, E value) {
        if ( !deq.isFull() ) {
            deq.insertRight(value);
        }
    }

    private static <E> void insertLeft(Deque<E> deq, E value) {
        if ( !deq.isFull() ) {
            deq.insertLeft(value);
        }
    }

    private static <E> void removeRight(Deque<E> deq) {
        if ( !deq.isEmpty() ) {
            deq.removeRight();
        }
    }

    private static <E> void removeLeft(Deque<E> deq) {
        if ( !deq.isEmpty() ) {
            deq.removeLeft();
        }
    }

    private static <E> void displayRightToLeft(Deque<E> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeRight());
        }
    }

    private static <E> void displayLeftToRight(Deque<E> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeLeft());
        }
    }
}
