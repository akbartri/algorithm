package designpatterns.builder;

public class FruitBuilder {
    private String name;
    private String color;
    private String size;
    private double price;

    public FruitBuilder name(String name) {
        this.name = name;
        return this;
    }

    public FruitBuilder color(String color) {
        this.color = color;
        return this;
    }

    public FruitBuilder size(String size) {
        this.size = size;
        return this;
    }

    public FruitBuilder price(double price) {
        this.price = price;
        return this;
    }

    public Fruit getFruit() {
        return new Fruit(name,color,size,price);
    }
}
