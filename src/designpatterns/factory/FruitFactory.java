package designpatterns.factory;

public class FruitFactory {
    public Fruit getInstance(String type) {
        if(type.toLowerCase().equalsIgnoreCase("apple")) {
            return new Apple();
        } else if (type.toLowerCase().equalsIgnoreCase("grape")) {
            return new Grape();
        } else {
            return new Orange();
        }
    }
}
