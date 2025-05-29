import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class TrhowAndThrows {
    public static void main(String[] args) throws FileNotFoundException {
        method2();
        System.out.println("THROW KEYWORD IS UDE TO THROW EXCEPTION FORCEFULLY");

    }
    public static void method2() throws FileNotFoundException {
        method1();
    }
    public static void method1() throws FileNotFoundException {
        try {

            FileReader filereader = new FileReader("o.txt");
        }catch (FileNotFoundException e){
            System.out.println("File not found: ");

            throw new FileNotFoundException("oops");
        }
    }
}
