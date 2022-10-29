package designpatterns.singleton;

public class Fruit {
    private String name;
    private double price;
    static Fruit fruit = new Fruit();

    private Fruit(){}
    public static Fruit getInstance() {
        return fruit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
