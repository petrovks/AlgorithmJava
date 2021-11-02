package ru.gb.algorithm.lesson4;

import ru.gb.algorithm.lesson3.deque.Deque;

public class LinkedDeque <E> implements Deque<E> {
    private final FullDirectionLinkedListImpl<E> data;

    public LinkedDeque() {
        this.data = new FullDirectionLinkedListImpl<>();
    }

    @Override
    public boolean insertLeft(E value) {
        data.insertLast(value);
        return true;
    }

    @Override
    public boolean insertRight(E value) {
        data.insertFirst(value);
        return true;
    }

    @Override
    public E removeLeft() {
        return data.removeLast();
    }

    @Override
    public E removeRight() {
        return data.removeFirst();
    }

    @Override
    public boolean insert(E value) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E peekFront() {
        return null;
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean isFull() {
        return data.isEmpty();
    }

    @Override
    public void display() {
        data.display();
    }
}
