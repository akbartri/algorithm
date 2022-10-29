package basic.newswitch;

public class NewSwitchTest {
    public static void main(String[] args) {
        //this feature added at java 12
        String dayName = "sunday";

        // old switch
        switch (dayName) {
            case "monday":
                System.out.println("I Like "+dayName);
                break;
            case "tuesday":
                System.out.println(dayName+" is wonderful!");
                break;
            default:
                System.out.println("This is not day");
                break;
        }

        //new switch in java 12
        switch (dayName) {
            case "monday","friday" -> System.out.println("I Like "+dayName);
            case "tuesday" -> System.out.println(dayName+" is wonderful!");
            default -> System.out.println("This is not a day");
        }
    }
}
