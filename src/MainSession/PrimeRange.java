package MainSession;

public class PrimeRange {
    public static void main(String[] args) {
        for (int i = 1; i <= 80; i++) {
            boolean flag = true;
            int a=2;
            while (i<a && flag == true){
                if (i%a==0){
                    flag = false;
                }
                a++;
            }
            if (flag == true){
                System.out.println(i);
            }
        }
    }
}
