package basic.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
//        List<Fruit> fruitList = dummyList();

//        intermediate operations
//        anyMatch()
//        distinct()
//        filter()
//        findFirst()
//        flatmap()
//        skip()
//        map()
//        sorted()

//        terminal operations
//        count()
//        max()
//        min()
//        reduce()
//        summaryStatistics()

        IntStream
                .range(0,10)
//                .forEach(System.out::println);  //will print 0 until 9
//                .sum(); //will return sum from 0 to 9
//                .average()
                ;

        Stream.of("Baws","Akbar","Query")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
//                .forEach(System.out::println);
//        String[] names = {"qwe","rty","uiop"};
//        Arrays.stream(names);         //jika stream dari array

//        List<Object> objectList= new ArrayList<>();
//        objectList.stream();

        Arrays
                .stream(new String[]{"Baws","Akbar","Query"})
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Map<String,String> hashMap = new HashMap<>();
        hashMap = Arrays
                .stream(new String[]{"Baws 1","Akbar 2","Query 3"})
                .map(String::toUpperCase)
                .map(name -> name.split(" ")).collect(Collectors.toMap(
                        data -> data[1],
                        data -> data[0]));

        for(String key : hashMap.keySet()) {
            System.out.println(key+" : "+hashMap.get(key));
        }
    }

    private static List<Fruit> dummyList(){
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("Apple","100g","Crimson"));
        fruitList.add(new Fruit("Grape","5g","Dark purple"));
        fruitList.add(new Fruit("Watermelon","1000g","Crimson"));

        return fruitList;
    }
}
