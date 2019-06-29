package com.javagda25.packTest;

import java.util.Arrays;

public class Insertion1 {
    public static void main(String[] args) {
        System.out.println();

        int[] tab = {3, 4, 5, 2, 6, 3, 5, 7, 3, 5, 1, 6};
        System.out.println("tab przed: " + Arrays.toString(tab));
        sortInsertion1(tab);
        System.out.println("tab po: " + Arrays.toString(tab));

    }

    public static void sortInsertion1(int[] tab) {
        for (int i = 1; i < tab.length; i++) {
            int element = tab[i];
            int index = i - 1;

            while (index >= 0) {
                if (element < tab[index]) {
                    tab[index + 1] = tab[index];
                    tab[index] = element;
                } else {
                    break;
                }
                index--;
            }
        }
    }
}
