package Student2;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Khánh", 23, "HCM"));
        students.add(new Student("Như", 28, "HCM"));
        students.add(new Student("Hương", 25, "HCM"));
        Collections.sort(students);
        for(Student student: students){
            System.out.println(student.toString());
        }
        Collections.sort(students, new AgeComparator());
        for(Student student: students){
            System.out.println(student.toString());
        }
    }
}
