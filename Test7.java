package Stream;

import Lambda.Student;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);

        University u1 = new University("BSTU");

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");

        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        u1.addFacultyToList(f1);
        u1.addFacultyToList(f2);

        u1.facultyList.stream().flatMap(faculty -> faculty
                .getStudentsOnFaculty()
                .stream())
                .forEach(st -> System.out.println(st.getName()));
    }
}

class University {
    String name;
    List<Faculty> facultyList;

    public University(String name) {
        this.name = name;
        facultyList = new ArrayList<>();
    }
    public void addFacultyToList(Faculty f) {
        facultyList.add(f);
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", facultyList=" + facultyList +
                '}';
    }
}
class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        this.studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student st) {
        studentsOnFaculty.add(st);
    }
}