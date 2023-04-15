package Searching_Algo;

import java.util.Scanner;

import static Searching_Algo.Binary_Search.BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 64, 66, 100, 121, 164, 256, 542,};
        int[] arr2 = {1201, 151, 120, 110, 94, 56, 35, 25, 10};
        BinarySearch(arr, 166);
        BinarySearch(arr2, 1201);
    }


}
