import model.Student;
import servis.StudentServis;

public class DigiSchool1 {

    public static void main(String[] args) {
        StudentServis servis = new StudentServis();
        Student s1 = servis.crateStudent();
        Student s2 = servis.crateStudent();
        Student s3 = servis.crateStudent();

        Student[] students = {s1, s2, s3};

        servis.maxAge(students).printInfo();
        servis.minAge(students).printInfo();
        Student student = servis.minAxjkeqiAge(students);
        if (student != null) student.printInfo();
        else System.out.println("axchik chka");
    }
}