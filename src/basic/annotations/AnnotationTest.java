package basic.annotations;

import java.lang.reflect.Field;

public class AnnotationTest {
    public static void main(String[] args) throws IllegalAccessException {
        Fruit fruit = new Fruit();
        fruit.setType("Berries");
        fruit.setName("Strawberry");

        for(Field field : fruit.getClass().getDeclaredFields()) {
            if(field.isAnnotationPresent(ImportantString.class)) {
                ImportantString annotation = field.getAnnotation(ImportantString.class);

                for(int i=0;i<annotation.times();i++) {
                    Object value = field.get(fruit);
                    if(value instanceof String typeValue) System.out.println(typeValue.toUpperCase());
                }
            }
        }

//        will print type value 3 times with uppercase because its an important string
    }
}
