package Abstraction;

public class Rock implements Music{
    @Override
    public void sound() {
        System.out.println("Rock sound is coming");
    }

    public static void main(String[] args) {
        Music m1 = new Rock();
        m1.sound();
    }
}
