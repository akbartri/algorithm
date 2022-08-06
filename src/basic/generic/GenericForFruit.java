package basic.generic;

public class GenericForFruit<T extends Fruit> {
    T fruit;

    public GenericForFruit(T fruit) {
        this.fruit = fruit;
    }

    public void print() {
        fruit.hello();
    }
}
