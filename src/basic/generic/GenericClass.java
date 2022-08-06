package basic.generic;

public class GenericClass<T> {
    T thingToPrint;

    public GenericClass(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
