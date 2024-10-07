package MainSession;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        boolean flag = true;
        int i=2;
        while (i<n && flag == true){
            if (n%i==0){
                flag = false;
            }
            i++;
        }
        if (flag == false){
            System.out.println("Number is not Prime");
        }else {
            System.out.println("Number is Prime");
        }
    }
}
