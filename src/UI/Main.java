package UI;

import Business.InstructorManager;
import Business.StudentManager;
import Core.Logger.DatabaseLogger;
import Core.Logger.FileLogger;
import Entities.Instructor;
import Entities.Student;

public class Main {

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager(new DatabaseLogger());
        InstructorManager instructorManager = new InstructorManager(new FileLogger());

        Student student1 = new Student(1,
                "ÖMER",
                "bir",
                "bir@gmail.com",
                "12346",
                "ÇANKIRI",
                "photoPath");
        Student student2 = new Student(1,
                "ÖMER",
                "bir",
                "bir@gmail.com",
                "12346",
                "ÇANKIRI",
                "photoPath");
        Student student3 = new Student(1,
                "ÖMER",
                "bir",
                "bir@gmail.com",
                "12346",
                "ÇANKIRI",
                "photoPath");

        Instructor instructor1 = new Instructor(2,
                "Engin",
                "Demiroğ",
                "engin@gmail.com",
                "123456",
                "Programing",
                50);

        addStudent(studentManager, student1);

        addInstructor(instructorManager, instructor1);

        addAddress(studentManager, student2);

        studentManager.getAll();
        System.out.println();
        instructorManager.getAll();
    }

    private static void addAddress(StudentManager studentManager, Student student) {
        System.out.println("Öğrencinin Adresini Güncelleme Metodu");
        studentManager.addAddress(student, "Mersin");
        System.out.println(student.getFirstName() + " adlı öğrencinin adresi: " + student.getAddress());
        System.out.println();
    }

    private static void addInstructor(InstructorManager instructorManager, Instructor instructor1) {
        System.out.println("Eğitmen Ekleme Metodu: ");
        instructorManager.add(instructor1);
        System.out.println();
    }

    private static void addStudent(StudentManager studentManager, Student student1) {
        System.out.println("Öğrenci Ekleme Metodu: ");
        studentManager.add(student1);
        System.out.println();
    }
}
