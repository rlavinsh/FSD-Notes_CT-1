package MainSession;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp>0){
            int rem = temp%10;
            sum = sum*10+rem;
            temp = temp/10;
        }
       if (sum == n){
           System.out.println("Number is Palindrome");
       }else{
           System.out.println("Number is not Palindrome");
       }
    }
}
