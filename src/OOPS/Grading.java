package OOPS;

public class Grading {
    String name;
    int rollNo;
    int marks;

    // Constructor
    public Grading(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public String calculateGrade() {
        if (marks >= 90 && marks <= 100) {
            return "A+";
        } else if (marks >= 80 && marks <= 89) {
            return "A";
        } else if (marks >= 70 && marks <= 79) {
            return "B+";
        } else if (marks >= 60 && marks <= 69) {
            return "B";
        } else if (marks >= 50 && marks <= 59) {
            return "C+";
        } else if (marks >= 40 && marks <= 49) {
            return "C";
        }
        else if (marks >= 30 && marks <= 39) {
            return "D+";
        }
        else {
            return "Fail";
        }
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Grading g1 = new Grading("Amit",15,85);
        Grading g2 = new Grading("Rahul",30,29);

        g1.displayDetails();
        System.out.println();
        g2.displayDetails();
    }
}
