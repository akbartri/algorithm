package basic.lambdaexpression;

public class Testing {
    public static void main(String[] args) {
        ContohFunctionalInterfaceImpl contohImplManual = new ContohFunctionalInterfaceImpl();
        contohImplManual.print();
//        diatas adalah contoh manual

//        dengan lambda expression, bisa menjadi seperti ini
        ContohFunctionalInterface contoh = () -> System.out.println("NGEPRINT pake lambda");
        printThing(contoh);
    }

    static void printThing(ContohFunctionalInterface functionalInterface) {
        functionalInterface.print();
    }
}
