package MainSession;

import java.util.Scanner;

public class TernaryProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
//        if (num%2==0){
//            System.out.println("Even");
//        }else {
//            System.out.println("Odd");
//        }

        // Convert the same program by using ternary operator
        String result = (num%2==0)?"Even":"Odd";
        System.out.println(result);
    }
}
