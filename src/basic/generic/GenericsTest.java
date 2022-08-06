package basic.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        System.out.println("Generic test!!");
        System.out.println("");

        GenericClass<String> stringGenericClass = new GenericClass<>("Akbar");
        stringGenericClass.print();

        GenericClass<Integer> integerGenericClass = new GenericClass<>(2);
        integerGenericClass.print();

        GenericClass<Double> doubleGenericClass = new GenericClass<>(2.5);
        doubleGenericClass.print();

        //generic for fruit test
        GenericForFruit<Apple> genericForFruit1 = new GenericForFruit<>(new Apple());
        genericForFruit1.print();

        GenericForFruit<Grape> genericForFruit2 = new GenericForFruit<>(new Grape());
        genericForFruit2.print();
//        GenericForFruit<String> genericForFruit3 = new GenericForFruit<>(); //error because String didnt extend from Fruit

        sayHi("Andi");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(1);
        printList(integerList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hi");
        stringList.add("my");
        stringList.add("name");
        stringList.add("is");
        stringList.add("Akbar!!");
        printList(stringList);

    }

    //generics in method
    public static <T> void sayHi(T thingsToSayHi) {
        System.out.println("Hi "+thingsToSayHi+"!!!!");
    }

    public static void printList(List<?> theList) {
        System.out.println(theList.toString());
//        for(int i=0;i<theList.size();i++) {
//            System.out.println(theList.get(i));
//        }
    }
}
