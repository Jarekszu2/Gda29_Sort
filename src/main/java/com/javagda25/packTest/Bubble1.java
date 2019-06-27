package com.javagda25.packTest;

public class Bubble1 {
    public static void sortJarBubble(int[] tab) {
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 1 + i; j < tab.length; j++) {
                counter++;
                if (tab[i] > tab[j]) {
                    int temp = 0;
                    temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        System.out.println(counter);
    }
}
