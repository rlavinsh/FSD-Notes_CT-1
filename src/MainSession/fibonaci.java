package MainSession;

import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = -1;
        int b = 1;

        while (n>0){
            int c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            n--;
        }
    }
}
