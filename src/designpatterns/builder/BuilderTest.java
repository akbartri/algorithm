package designpatterns.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Fruit apple = new FruitBuilder().name("Apple").color("Red").size("Small").price(300).getFruit();
        System.out.println(apple.toString());
    }
}
