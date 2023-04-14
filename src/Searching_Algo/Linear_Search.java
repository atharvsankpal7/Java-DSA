package Searching_Algo;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[100];
        int key;
        for(int i=0;i<arr.length;i++)
            arr[i]=i+1;
        System.out.println("Enter the element that you want to search (`int`) :");
        key=in.nextInt();
        if(LinearSearch(arr,key)) {
            System.out.println("The element is present in the array");
        }
        else{
            System.out.println("The element is not present in the array");
        }
    }
    static boolean LinearSearch(int[] arr,int key){
        boolean retVal=false;
        for (int j : arr) {
            if (key == j) {
                retVal = true;
                break;
            }
        }
        return retVal;
    }
}

