package Searching_Algo;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.print("Enter the number that you want to enter : ");
        int key = in.nextInt();
        BinarySearch(arr, key);

    }

    static void BinarySearch(int[] array, int key) {
        if (array[0] < array[array.length - 1]) {
            int low = 0, high = array.length;
            int mid;
            while (low <= high) {
                //The formula is such that if the value of `low+high` exceeds the limit of the int then new formula will prevent it.
                mid = (low + ((high - low) / 2));
                if (array[mid] == key) {
                    System.out.println("The Element is present in the array");
                   return;
                      } else if (array[mid] > key) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            System.out.println("The element is not present in the array");

        } else {
            int low = 0, high = array.length;
            int mid;

            while (low <= high) {
                //The formula is such that if the value of `low+high` exceeds the limit of the int then new formula will prevent it.
                mid = (low + ((high - low) / 2));
                if (array[mid] == key) {
                    System.out.println("The Element is present in the array");
                    return;
                } else if (array[mid] < key) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            System.out.println("The element is not present in the array");
        }
    }
}
