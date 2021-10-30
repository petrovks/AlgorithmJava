package ru.gb.algorithm.lesson3.deque;

import ru.gb.algorithm.lesson3.queue.Queue;

public interface Deque<E> extends Queue<E> {

    boolean insertLeft(E value);
    boolean insertRight(E value);

    E removeLeft();
    E removeRight();
}
