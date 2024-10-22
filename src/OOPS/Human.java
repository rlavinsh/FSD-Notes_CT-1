package OOPS;

public class Human {
  String name;
     static int population;
    public Human(String name) {
        this.name = name;
        population++;
    }

    public void display(){
        System.out.println("Total Population is "+population);
    }

    public static void main(String[] args) {
        Human h1 = new Human("Ankit");
        Human h2 = new Human("Amit");
        Human h3 = new Human("Rahul");

        h3.display();
    }




}
