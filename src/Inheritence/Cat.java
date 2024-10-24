package Inheritence;

public interface Cat extends Animal{
    @Override
    default void sound(){
        System.out.println("Meow Sound is coming");
    }
}
