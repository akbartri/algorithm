package logarithm;

public class LogarithmTest {
    public static void main(String[] args) {
        System.out.println("hi Logarithm");

//        System.out.println(fibonacci(8));
        String firstName = "Akbar";
        String secondName = "Akbar";
        String thirdName = new String("Akbar");

        System.out.println(firstName == secondName);
        System.out.println(firstName == thirdName);
        System.out.println(secondName == thirdName);
    }

    private static long fibonacci(int n) {
        if(n<=1) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
