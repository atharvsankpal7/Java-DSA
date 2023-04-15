package Searching_Algo;

import java.util.Scanner;

public class Binary_Search_Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matrix1 = {{10, 20, 30, 40}, {12, 28, 31, 47}, {19, 30, 37, 49}, {31, 33, 39, 51}};
        int key = in.nextInt();
        if (BinarySearchMatrix2(matrix1, key)) {
            System.out.println("The element is present in the matrix");
        } else {
            System.out.println("The element is not present in the matrix");
        }
    }

    static boolean BinarySearchMatrix(int[][] matrix, int key) {
        int i = 0;
        int j = matrix.length - 1;
        if (key > matrix[i][j] || key < matrix[i][j]) {
            return false;
        }
        while (matrix[i][j] > key) {
            j--;
        }
        while (matrix[i][j] < key) {
            i++;
        }
        return matrix[i][j] == key;
    }

    static boolean BinarySearchMatrix2(int[][] matrix, int key) {
        boolean result = false;
        int i = 0, j = matrix.length - 1;
        while (i < matrix.length && j > -1) {
            if (matrix[i][j] == 0) {
                result = true;
                break;
            } else if (matrix[i][j] < key) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}
