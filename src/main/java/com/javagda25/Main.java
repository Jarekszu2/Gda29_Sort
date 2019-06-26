package com.javagda25;

import com.javagda25.bubble.BubbleSort;
import com.javagda25.counting.CountingSort;
import com.javagda25.insertion.InsertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] pesymistyczna = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] optymistyczna = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

//        BubbleSort.sort(optymistyczna);
//        InsertionSort.sort(optymistyczna);
//        InsertionSort.sort(pesymistyczna);
        CountingSort.sort(pesymistyczna, 10);

//        System.out.println(Arrays.toString(pesymistyczna));
        System.out.println(Arrays.toString(optymistyczna));
    }
}
