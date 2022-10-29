package designpatterns.factory;

public class Grape implements Fruit {
    @Override
    public void printType() {
        System.out.println("This is a Grape!");
    }
}
