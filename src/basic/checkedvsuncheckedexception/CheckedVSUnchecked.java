package basic.checkedvsuncheckedexception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVSUnchecked {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Checked VS Unchecked Exceptions");

//        checked exception = exception that check at compile time (able to stop coder from compiling code)
//        unchecked exception = exception that check at run time (coder can compile the code, but it has probability to produce exception later)

        //example of checked exception
//        FileReader fr = new FileReader("mytext.txt"); //will show up an error, that tell us this line will produce FileNotFoundException
        //need to handle with try catch or able to handle by throws
        String nameFile = "mytext.txt";
        try {
            FileReader fr = new FileReader(nameFile);
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
        }

//        able to handle like this, but the program will stopped when found an error
//        readFileFunction(nameFile);

        //example of unchecked exception
        Integer angka = Integer.parseInt("0");
        System.out.println(angka);

        //jika string nya tidak mengandung angka / null, maka saat di parsing akan muncul exception
        //coder bisa mengcompile baris code ini, jika ada error maka akan ketawan saat baris code program tersebut di eksekusi
    }

    private static void readFileFunction(String nameFile) throws FileNotFoundException {
        FileReader fr = new FileReader(nameFile);
    }
}
