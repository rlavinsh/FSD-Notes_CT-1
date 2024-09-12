import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        // if you want to take the input in the numbers format
        Scanner scn = new Scanner(System.in);
        /*
         System.out.println("Enter the first number");
        int num1 = scn.nextInt();
        System.out.println("Enter the second number");
        int num2 = scn.nextInt();
        int sum = num1+num2;
        System.out.println("Addition is "+sum);
        * */

        //If you want to take input in floating values
        System.out.println("Enter the first floating value");
        float a = scn.nextFloat();
        System.out.println("Enter the second float value");
        float b = scn.nextFloat();
        float c = a+b;
        System.out.println("Floating sum is "+c);



    }

}
