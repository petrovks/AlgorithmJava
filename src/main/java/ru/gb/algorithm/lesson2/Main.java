package ru.gb.algorithm.lesson2;

import ru.gb.algorithm.lesson2.model.Notebook;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final int NOTEBOOKS_COUNT = 5000;

    public static void main(String[] args) {
        List<Notebook> notebooks = generateListNotebooks();

        long timeStart = System.currentTimeMillis();
        System.out.println("Сортировка по цене началась");
        SortNotebooksSelection.sortByPrice(notebooks);
        long timeEnd = System.currentTimeMillis();
        displayNotebooks(notebooks);
        System.out.printf("Сортировка по цене закончилась. Прошло времени: %dms", timeEnd - timeStart);
        SortNotebooksSelection.sortByMemory(notebooks);
        int i = 10;
        while (i != 0) {
            System.out.println("****");
            i--;
        }

        timeStart = System.currentTimeMillis();
        System.out.println("Сортировка по памяти началась");
        SortNotebooksSelection.sortByMemory(notebooks);
        timeEnd = System.currentTimeMillis();
        displayNotebooks(notebooks);
        System.out.printf("Сортировка по памяти закончилась. Прошло времени: %dms", timeEnd - timeStart);


    }

    private static void displayNotebooks(List<Notebook> list) {
        for (Notebook n : list) {
            System.out.printf("Ноутбук:\tс\\н: %s,\tцена: %s,\tпамять: %s,\tпроизводитель: %s%n", n.getSerialId(),
                    n.getPrice(),
                    n.getMemory(), n.getProducer());
        }
    }

    private static ArrayList<Notebook> generateListNotebooks() {
        ArrayList<Notebook> arrayList = new ArrayList<>();
        for (int i = 0; i < NOTEBOOKS_COUNT; i++) {
            arrayList.add(createNotebook());
        }
        return arrayList;
    }

    private static Notebook createNotebook() {
        Random random = new Random();
        BigDecimal price = BigDecimal.valueOf(random.nextInt(26) * 50 + 500);
        int memory = (random.nextInt(6) + 1) * 4;
        int producersCount = Notebook.Producer.values().length;
        Notebook.Producer producer = Notebook.Producer.values()[random.nextInt(producersCount)];
        return new Notebook(price, memory, producer);
    }
}
