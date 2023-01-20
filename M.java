import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class M {

    public static void main(String[] args) throws IOException {

        String url = "C:\\Users\\User\\Rekursia\\src\\test.txt";

        write(url, minStudent(read(url)).toString());
    }

    public static Student[] read(String url) throws IOException {

        String[] strings = Files.readAllLines(Paths.get(url)).toArray(new String[0]);
        Student[] students = new Student[strings.length];


        for (int i = 0; i < strings.length; i++) {
            String[] str = strings[i].split(",");
            students[i] = (new Student(str[0], Integer.parseInt(str[1])));
        }

        return students;
    }


    public static Student minStudent(Student[] students) {
        Student min = students[0];
        for (int i = 1; i < students.length; i++) {
            if (min.getAge() < students[i].getAge()) min = students[i];
        }
        return min;
    }

    public static void write(String url, String text) throws IOException {

        Files.writeString(Paths.get(url), "\n" + text, StandardOpenOption.APPEND);


    }

}
