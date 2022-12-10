package oop.digi;

import oop.model.Student;

import java.util.Scanner;

public class DigiSchool1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        Student[] students = {student1, student2, student3};

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student N" + (i + 1) + " enter your firstName");
            students[i].setFirstName(sc.next());
            System.out.println("Student N" + (i + 1) + " enter your lastName");
            students[i].setLastName(sc.next());
            System.out.println("Student N" + (i + 1) + " enter your year");
            students[i].setYear(sc.nextInt());
            System.out.println("Student N" + (i + 1) + " enter your mark");
            students[i].setMark(sc.nextInt());
            System.out.println("Student N" + (i + 1) + " hay es? true or false");
            students[i].setArmenian(sc.nextBoolean());
            System.out.println("Student N" + (i + 1) + " enter your gender");
            students[i].setGender(sc.next().charAt(0));
            students[i].printInfo();
            System.out.println();
        }

        for (Student s : students) {
            s.printInfo();
        }
    }
}