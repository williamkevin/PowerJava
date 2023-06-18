import java.io.*;

public class TryTest {
    public static void main(String [] args) {
        try (FileReader fr = new FileReader("hello.rtf")) {
            char [] a = new char[50];
            fr.read(a);
            for (char c : a)
                System.out.println(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
