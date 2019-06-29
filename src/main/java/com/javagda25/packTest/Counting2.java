package com.javagda25.packTest;

import java.util.Arrays;

public class Counting2 {
    public static void main(String[] args) {
        System.out.println();

        int[] tab = {3, 5, 7, 2, 4, 9, 0, 5, 2, 3, 4, 2, 6, 9, 5, 5, 1, 8};
        System.out.println("tab przed: " + Arrays.toString(tab));
        sortCounting2(tab, 9);
        System.out.println("tab po: " + Arrays.toString(tab));
    }

    public static void sortCounting2(int[] tab, int number) {
        int[] tabCounting = new int[number + 1];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j <= number ; j++) {
                if (tab[i] == j) {
                    tabCounting[j]++;
                }
            }
        }
        System.out.println(Arrays.toString(tabCounting) + " size: " + tabCounting.length);
        int counter = 0;
        for (int i = 0; i <= number; i++) {
            for (int j = 1; j <= tabCounting[i]; j++) {
                tab[counter] = i;
                counter++;
            }
        }
    }
}
