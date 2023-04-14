package JavaBasics;

import java.util.Scanner;

public class inputs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your roll number : ");
        System.out.println("Your roll number is : " + input.nextInt());
        System.out.print("Enter your CGPA : ");
        float CGPA = input.nextFloat();
        System.out.println("Your CGPA is : " + CGPA);
        input.nextLine();// the scanner does not consume the newline character (i.e., \n) generated when
                         // the user presses the "Enter" key. As a result, when input.nextLine() is
                         // called, it reads the newline character left in the input buffer and returns
                         // an empty string without waiting for further input.
        System.out.println("Enter your name : ");
        String str = input.nextLine();
        System.out.println("Your name is : " + str);
    }
}
