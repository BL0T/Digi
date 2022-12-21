import model.Dekan;
import model.Student;
import model.Teacher;
import servis.DekanServis;
import servis.StudentServis;
import servis.TeacherServis;

public class DigiSchool1 {

    public static void main(String[] args) {
        StudentServis studentServis = new StudentServis();
        Student s1 = studentServis.crateStudent();

        s1.printInfo();

        TeacherServis teacherServis = new TeacherServis();
        Teacher teacher = teacherServis.crateTeacher();

        teacher.printInfo();

        DekanServis dekanServis = new DekanServis();
        Dekan dekan = dekanServis.crateDekan();

        dekan.printInfo();


    }
}