package ru.gb.algorithm.lesson2.model;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Value
public class Notebook implements Comparable<Notebook> {
    BigDecimal price;
    int memory;
    Producer producer;
    UUID serialId = UUID.randomUUID();

    public enum Producer {
        LENOVO, ASUS, DELL, ACER, HP, IMAC
    }

    @Override
    public int compareTo(Notebook n) {
        int result = price.compareTo(n.getPrice());
        if (result == 0) {
            result =  Integer.compare(memory, n.getMemory());
            if (result == 0) {
                return producer.compareTo(n.getProducer());
            }
            return result;
        }
        return result;
    }

}