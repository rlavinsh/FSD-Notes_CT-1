package Abstraction;

public class Lion extends Animal{
    @Override
    void sound() {
        System.out.println("Roar sound is coming");
    }
    public static void main(String[] args) {
        Animal aa = new Lion();
        aa.sound();
    }


}
