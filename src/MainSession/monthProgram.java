package MainSession;

import java.util.Scanner;

public class monthProgram {
    /*
    You are tasked with writing a program that identifies the name of a month based on the input provided by the user. The user will enter a number between 1 and 12, where each number corresponds to a month of the year.
Input Range:
If the user inputs a number between 1 and 8, your program should print the corresponding month name (January to August).
For numbers greater than 8, the program should execute the default case, outputting a message like "Invalid input or Month beyond August."

    * */
    public static void main(String[] args) {

        System.out.println("Enter the Month number");
        Scanner sc = new Scanner(System.in);
        int monthNumber = sc.nextInt();
        switch (monthNumber){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            default:
                System.out.println("Month beyond August.");
                break;
        }
    }
}
