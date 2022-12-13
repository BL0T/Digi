package servis;

import model.Student;

import java.util.Scanner;

public class StudentServis {
    public Student crateStudent() {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Student enter your firstName");
        student.setFirstName(sc.next());
        System.out.println("Student enter your lastName");
        student.setLastName(sc.next());
        System.out.println("Student enter your year");
        student.setYear(sc.nextInt());
        System.out.println("Student enter your mark");
        student.setMark(sc.nextDouble());
        System.out.println("Student hay es? yes or no");
        student.setArmenian(sc.next().equals("yes"));
        System.out.println("Student enter your gender");
        student.setGender(sc.next().charAt(0));
        return student;
    }

    public Student minAxjkeqiAge(Student[] a) {
        Student student = null;
        int min = 150;
        for (Student s : a) {
            if (s.getGender() == 'F' && min > 2022 - s.getYear()) {
                min = s.getYear();
                student = s;
            }
        }

        return student;
    }

    public Student minAge(Student[] a) {
        Student student = null;
        int min = 150;
        for (Student s : a) {
            if (min > 2022 - s.getYear()) {
                min = s.getYear();
                student = s;
            }
        }

        return student;
    }

    public Student maxAge(Student[] a) {
        Student student = null;
        int max = -1;
        for (Student s : a) {
            if (max < 2022 - s.getYear()) {
                max = s.getYear();
                student = s;
            }
        }

        return student;
    }
}
