package conditionals_loops;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();

        if(IsPrime(a)){
            System.out.println("The number is prime");
        }
        else {
            System.out.println("The number is not prime");
        }
        if(IsArmstrong(a)){
            System.out.println("The number is Armstrong digit");
        }
        else{
            System.out.println("The number is not a Armstrong digit");
        }
    }

    static boolean IsPrime(int a) {
        boolean result = false;
        boolean finished = false;
        if (a > 1) {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    finished = true;
                    break;
                }
            }
            if (!finished) {
                result = true;
            }
        }
        return result;
    }
    static Boolean IsArmstrong(int a){
        int cube=0,num=a;
        while(a!=0){
            int buff=a%10;
            cube+=buff*buff*buff;
            a=a/10;
        }
        return cube == num;
    }

}
