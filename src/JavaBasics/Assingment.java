package JavaBasics;

import java.util.Scanner;

public class Assingment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //To calculate Fibonacci Series up to n numbers.
        System.out.println(Fib(3));

    }
    public static int Fib(int n){
        int a = 0, b = 1, c = 0;
        for (int i = 2; i < n; i++) {

            c = a + b;
            a = b;
            b = c;

        }
            return c;
    }


}
