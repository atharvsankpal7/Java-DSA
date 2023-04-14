package JavaBasics;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        //primitive datatype are those who cannot be divided further
        int roll_no=2105;
        float CGPA = 8.08f;
        long SocialCreditScore = 646464664634654634L;


        double largeDouble=654654.3554;
        boolean fact=true;
        String name = "Atharv";//String is not a primitive datatype


    }

    public static class sum {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the First number --> ");
            float a = input.nextFloat();
            System.out.println("Enter the Second number --> ");
            float b = input.nextFloat();
            float c = a + b;
            System.out.println("The JavaBasics.DataType.sum of these two numbers is -->" + c);

        }

    }
}
