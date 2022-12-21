package servis;

import model.Teacher;

import java.util.Scanner;

public class TeacherServis extends HumanServis {
    public Teacher crateTeacher() {
        Scanner sc = new Scanner(System.in);
        Teacher teacher = new Teacher();

        System.out.println("Teacher enter your ashxatavardz");
        teacher.setAshxatavardz(sc.nextInt());
        super.createHuman(teacher);

        return teacher;
    }
}