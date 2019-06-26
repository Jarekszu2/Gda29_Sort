package com.javagda25.insertion;

public class InsertionSort {
    public static void sort(int[] tablica) {
        int licznikOperacji = 0;

        for (int i = 1; i < tablica.length; i++) {
            int elementPorownywany = tablica[i];

            int indeksPorownywany = i - 1;
            while (indeksPorownywany >= 0) {
                licznikOperacji++;
                if (elementPorownywany > tablica[indeksPorownywany]) {
                    // przestawienie elementów
                    tablica[indeksPorownywany + 1] = tablica[indeksPorownywany];
                    tablica[indeksPorownywany] = elementPorownywany;
                }else{
                    break;
                }

                indeksPorownywany--;
            }
        }

        System.out.println(licznikOperacji);
    }
}
