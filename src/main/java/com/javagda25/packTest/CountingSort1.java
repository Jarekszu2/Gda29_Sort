package com.javagda25.packTest;

import java.util.Arrays;

public class CountingSort1 {
    public static void sortJarCounting(int[] tab, int number) {
        int[] tabNumber = new int[number + 1];
        int[] tabCounter = new int[number + 1];
        int[] tabCopy = new int[tab.length];

        // tworzę tablicę użytych liczb
        for (int i = 0; i < number + 1; i++) {
            tabNumber[i] = i;
        }

        // tworzę tablicę wystąpień danej liczby
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tabNumber.length; j++) {
                if (tab[i] == tabNumber[j]) {
                    tabCounter[j]++;
                }
            }
        }

        // tworzę posortowaną kopię
        int intCopy = 0;
        for (int i = 0; i < tabNumber.length; i++) {
            for (int j = 0; j <= tabCounter[i]; j++) {
                if (tabCounter[j] != 0) {
                    tabCopy[intCopy] = tabNumber[i];
                    intCopy++;
                }
            }
        }

        tab = tabCopy;
        System.out.println("tab sorted " + Arrays.toString(tab));

//        return tab;
    }
}
