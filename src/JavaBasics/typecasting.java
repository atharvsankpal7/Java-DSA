package JavaBasics;

import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the float --> ");
        float num_float = input.nextFloat();
        System.out.println(num_float);

        int num_int = (int) (num_float);//TypeCasting
       // System.out.println("The value of after typecasting is  : "+num_int);

        //TypeCasting
        int num1 = (int) (37.35f);
        System.out.println(num1);

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte) (a);// 257 % (max size of byte i.e. 256)
        System.out.println(b);
*/

/*
        byte a = 10;
        byte b=4;
        a = (byte) (a * b);
        System.out.println(a);

*/

/*
        int number = 'a';//Number will get ascii value of 'a'
        System.out.println(number);
*/

        int a=24;
        short b=3;
        byte c=12;
        float d=3.14f;
        double e=.2345;
        char f ='a';
        System.out.println(d * c + " " + e / a + " " + f * b);
        //The result of the operation is in the form of operand with the largest size
        double result = d * c + e / a - f * b;
        System.out.println(result);
    }
}


