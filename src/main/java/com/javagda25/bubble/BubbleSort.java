package com.javagda25.bubble;

public class BubbleSort {
    public static void sort(int[] tablica) {

        int licznikOperacji = 0;

        for (int j = 0; j < tablica.length; j++) { // * n (obiegów)
            for (int i = 0; i < tablica.length - 1 - j; i++) { // * n-1 (obiegów)
                licznikOperacji++;
                if (tablica[i] < tablica[i + 1]) {
                    // podmiana elementów
                    int tmp = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = tmp;
                }
            }
        }
        System.out.println(licznikOperacji);
    }
}
