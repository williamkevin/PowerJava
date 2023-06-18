import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2 {
    public static void main(String args) throws Exception {
        try (FileReader fr = new FileReader("hello.rtf")) {
            int ch;
            while ((ch = fr.read()) != -1)
                System.out.print((char) ch);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
