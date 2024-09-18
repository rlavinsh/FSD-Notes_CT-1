public class GradingSystem {
    public static void main(String[] args) {
        int marks = 93;
        if (marks>=95 && marks<=100){
            System.out.println("A+");
        } else if (marks>=90 && marks<=94) {
            System.out.println("A");
        } else if (marks >= 85 && marks<=89) {
            System.out.println("B+");
        }
        else if (marks >= 80 && marks<=84) {
            System.out.println("B");
        }
        else if (marks >= 75 && marks<=79) {
            System.out.println("C+");
        }
        else if (marks >= 70 && marks<=74) {
            System.out.println("C");
        }
        else if (marks >= 65 && marks<=69) {
            System.out.println("D+");
        }
        else if (marks >= 60 && marks<=64) {
            System.out.println("D");
        }else {
            System.out.println("Fail");
        }
    }
}
