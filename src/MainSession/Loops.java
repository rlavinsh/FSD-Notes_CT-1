package MainSession;

public class Loops {
    public static void main(String[] args) {
        // while loop
//        int i=1;
//        while (i<=10){
////            System.out.println("Hello "+i);
//            System.out.println("Good Afternoon");
//            i++;
//        }
        //        int n=5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if ( i==n-1 || j==0 || j==n-1){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }

//        int n=5;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int n=5;
//
//        for (int i = n; i >0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        int n = 10;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && i + j == n - 1) {
                    System.out.print("*"); // Print a single star at the intersection
                } else if (i == j || i + j == n - 1) {
                    // Print stars on the diagonals, except the intersection
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Print spaces elsewhere
                }
            }
            System.out.println();
        }
    }
}
