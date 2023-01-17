import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class M {

    public static void main(String[] args) throws IOException {

        for (Student s : f()) {
            System.out.println(s);
        }
    }

    public static Student[] f() throws IOException {

        Path path = Paths.get("C:\\Users\\User\\Rekursia\\src\\test.txt");

        Student[] students = new Student[11];

        String[] strings = Files.readAllLines(path).toArray(new String[0]);

        for (int i = 0, j; i < strings.length; i++) {
            String s = strings[i];
            j = s.indexOf(',');
            students[i] = (new Student(s.substring(0, j), Integer.parseInt(s.substring(j + 1))));
        }

        return students;
    }
}
