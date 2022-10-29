package designpatterns.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Fruit apple = Fruit.getInstance();
        apple.setName("Apple");
        apple.setPrice(300);
        System.out.println(apple.toString());

        Fruit grape = Fruit.getInstance();
        grape.setName("Grape");
        grape.setPrice(100);
        System.out.println(grape.toString());
    }
}
