package com.javagda25;

import com.javagda25.counting.CountingSort;
import com.javagda25.packTest.Bubble1;
import com.javagda25.packTest.CountingSort1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] pesymistyczna = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] optymistyczna = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.println("optymistyczna przed " + Arrays.toString(optymistyczna));
//        BubbleSort.sort(optymistyczna);
        CountingSort.sort(optymistyczna,10);
//        InsertionSort.sort(optymistyczna);
//        InsertionSort.sort(pesymistyczna);
//        CountingSort1.sort(pesymistyczna, 10);
//        MergeSort.sort(optymistyczna);
//        Bubble1.sortJarBubble(optymistyczna);
//        Bubble1.sortJarBubble(pesymistyczna);

//        System.out.println(Arrays.toString(pesymistyczna));
        System.out.println("optymistyczna po " + Arrays.toString(optymistyczna));
//        System.out.println(Arrays.toString(pesymistyczna));
//
        System.out.println();
        int[] test = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("test przed " + Arrays.toString(test));
        CountingSort1.sortJarCounting(test, 10);
        System.out.println("test po " + Arrays.toString(test));
    }
}
