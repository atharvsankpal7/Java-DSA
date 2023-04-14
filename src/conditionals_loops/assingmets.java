package conditionals_loops;

import java.util.Scanner;

import static conditionals_loops.prime.IsPrime;

public class assingmets {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the sides of the triangle");
//        int a, b, c;
//        a = in.nextInt();
//        b = in.nextInt();
//        c = in.nextInt();
//        if (IsPythagorean(a, b, c)) {
//            System.out.println("The Triplet is Pythagorean\n");
//        } else {
//            System.out.println("The Triplet is not Pythagorean\n");
//
//        }
        int[] arr={17,39,93,71,47,97,32,17};
        System.out.println("These are prime numbers in the array :");
        for (int a : arr) {
            if(IsPrime(a)){
                System.out.println(a);
            }
        }
    }

    public static boolean IsPythagorean(int a, int b, int c) {
        boolean value = false;
        int hypo = a;
        if (hypo < b) {
            hypo = b;
        }
        if (hypo < c) {
            hypo = c;
        }
        if (hypo == a) {
            if (hypo * hypo == (b * b) + (c * c)) {
                value = true;
            }
        } else if (hypo == b) {
            if (hypo * hypo == (a * a) + (c * c)) {
                value = true;
            }
        } else if (hypo == c) {
            if (hypo * hypo == (b * b) + (a * a)) {
                value = true;
            }
        }
        return value;




    }
    //ChatGpt is insane
    public static boolean isRightTriangle(int a, int b, int c) {
        int hypo = Math.max(Math.max(a, b), c);
        return (hypo * hypo == a * a + b * b + c * c - hypo * hypo);
    }
}
