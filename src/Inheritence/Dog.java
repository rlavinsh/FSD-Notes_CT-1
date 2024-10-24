package Inheritence;

public interface Dog extends Animal{
    @Override
    default void sound(){
        System.out.println("Bark Sound is coming");
    }
}
