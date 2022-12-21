package servis;

import model.Student;

import java.util.Scanner;

public class StudentServis extends HumanServis {
    public Student crateStudent() {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Student enter your mark");
        student.setMark(sc.nextDouble());
        super.createHuman(student);

        return student;
    }
}