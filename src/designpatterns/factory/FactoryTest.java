package designpatterns.factory;
public class FactoryTest {
    public static void main(String[] args) {
        FruitFactory ff = new FruitFactory();
        Fruit fruit1 = ff.getInstance("grape");
        fruit1.printType();

        Fruit fruit2 = ff.getInstance("apple");
        fruit2.printType();

        Fruit fruit3 = ff.getInstance("orange");
        fruit3.printType();
    }
}
