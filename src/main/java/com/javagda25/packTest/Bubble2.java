package com.javagda25.packTest;

import java.util.Arrays;

public class Bubble2 {
    public static void main(String[] args) {
        System.out.println();

        int[] tab = {7, 4, 3, 4, 7, 1, 0, 11, 2, 9};
        System.out.println("tab przed: " + Arrays.toString(tab));
        sortBubble2(tab);
        System.out.println("tab po: " + Arrays.toString(tab));
    }

    public static void sortBubble2(int[] tab) {
        int temp = 0;
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                counter++;
                if (tab[j] < tab[i]) {
                    temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        System.out.println(counter);
    }
}
