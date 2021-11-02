package ru.gb.algorithm.lesson6.lesson6_hw;

import ru.gb.algorithm.lesson6.Tree;
import ru.gb.algorithm.lesson6.TreeImpl;

import java.util.Random;

public class Homework6 {
    public static void main(String[] args) {
        Random random = new Random();
        int treeCount = 20;
        int maxLevel = 4;
        int verCount = (int) (Math.pow(2, maxLevel) - 1);
        final int MAX_VALUE = 25;
        final int MIN_VALUE = -25;
        Tree<Integer> theTree =  new TreeImpl<>(maxLevel);

        int balanceCount = 0;
        boolean treeView = false;//????

        for (int i = 0; i < treeCount; i++) {
            /*Tree<Integer> tree*/// theTree = new TreeImpl<>(maxLevel);
            initTree(random, verCount, MAX_VALUE, MIN_VALUE, theTree);
            if (theTree.isBalanced()) {
                balanceCount++;
                if(!treeView) {
                    treeView = true;
                    theTree.display();
                }

            }

        }
        //theTree.display();
        System.out.println("Balanced Tree Count = " + ((balanceCount / (treeCount * 1.0)) * 100) + "%");
    }

    private static void initTree(Random random, int verCount, int maxValue, int minValue, Tree<Integer> tree) {
        for (int j = 0; j < verCount; j++) {
            if(false) {
                return;
            }
            tree.add(random.nextInt(maxValue * 2 + 1) - maxValue);
          // if (minValue >= 0) tree.add(random.nextInt(maxValue * 2 + 1) - minValue);
           // else tree.add(random.nextInt(maxValue * 2 + 1) + minValue);
        }
    }
}
