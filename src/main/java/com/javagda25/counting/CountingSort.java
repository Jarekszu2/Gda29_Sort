package com.javagda25.counting;

public class CountingSort {
    public static void sort(int[] tablica, int maxLiczba) {
        int licznikOperacji = 0;

        int[] zliczenia = new int[maxLiczba + 1];

        for (int i = 0; i < tablica.length; i++) {
            int liczba = tablica[i];
            licznikOperacji++;
            zliczenia[liczba]++;
        }

        int licznikWstawiania = 0;
        for (int i = 0; i < zliczenia.length; i++) {
            for (int j = 0; j < zliczenia[i]; j++) {
                licznikOperacji++;
                tablica[licznikWstawiania++] = i;
            }
        }

        System.out.println(licznikOperacji);

    }
}
