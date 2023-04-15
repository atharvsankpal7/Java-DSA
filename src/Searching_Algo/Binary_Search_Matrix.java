package Searching_Algo;

import java.util.Scanner;

public class Binary_Search_Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matrix1 = {{10, 20, 30, 40}, {12, 28, 31, 47}, {19, 30, 37, 49}, {31, 33, 39, 51},{40,50,60,70 }};
        int key = in.nextInt();
        if (BinarySearchMatrix(matrix1, key)) {
            System.out.println("The element is present in the matrix");
        } else {
            System.out.println("The element is not present in the matrix");
        }
    }

    static boolean BinarySearchMatrix(int[][] matrix, int key) {
        int i = 0;
        int j = matrix[0].length - 1;
        //Checking the shortest and largest number in matrix
        if (key > matrix[i][i] || key < matrix[j][j]) {
            return false;
        }
        //Checking the column
        while (matrix[i][j] > key) {
            j--;
        }
        //Cheking the row
        while (matrix[i][j] < key) {
            i++;
        }
        //Returning the value
        return matrix[i][j] == key;
    }

    static boolean BinarySearchMatrix2(int[][] matrix, int key) {
        boolean result = false;
        int i = 0;
        int j = matrix[0].length - 1;
        //Checking for array bound
        while (i < matrix.length && j > -1) {
            if (matrix[i][j] == key) {
                result = true;
                break;
            //Checking the row
            } else if (matrix[i][j] < key) {
                i++;
            }
            //Checking the column
            else {
                j--;
            }
        }
        //Returning the function
        return result;
    }
}
