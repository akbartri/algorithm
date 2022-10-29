package basic.records;

public class RecordTest {
    public static void main(String[] args) {
        //new feature on java 14

        //automate will create getter, hash, toString, equals etc
        //with one condition, the params inside the record declared as final
        //so once it got init, it cant change, that means
        //record only use for sending data, not for manipulate data inside the obj
        EmployeeRecord employeeRecord = new EmployeeRecord("Andi",23);
        System.out.println(employeeRecord.name()+" "+employeeRecord.age());
    }
}
