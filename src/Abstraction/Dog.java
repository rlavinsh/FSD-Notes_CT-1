package Abstraction;

public class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Bark sound is coming");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.sleep();
    }
}
