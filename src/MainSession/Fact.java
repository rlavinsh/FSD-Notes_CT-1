package MainSession;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pro=1;
        while (n>0){
            pro = pro*n;
            n--;
        }
        System.out.println(pro);
    }
}
