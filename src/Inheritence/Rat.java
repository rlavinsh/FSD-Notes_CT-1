package Inheritence;

public class Rat implements Cat,Dog{

    @Override
    public void sound() {
        Cat.super.sound();
        Dog.super.sound();
    }

    public static void main(String[] args) {
        Rat r1 = new Rat();
        r1.sound();
    }
}
