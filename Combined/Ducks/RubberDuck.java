package Ducks;

public class RubberDuck extends Quackable {
    @Override
    protected void performQuack() {
        System.out.println("Squeak");
    }
}