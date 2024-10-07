package MainSession;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        int temp = n;
        int count = 0;
        while (temp>0){
            temp = temp/10;
            count++;
        }
        int temp1 = n;
        int sum = 0;
        while (temp1>0){
            int rem = temp1%10;
            sum=sum+(int)Math.pow(rem,count);
            temp1 = temp1/10;
        }
        if (n==sum){
            System.out.println("Number is Armstrong");
        }else{
            System.out.println("Number is not Armstrong");
        }
    }
}
