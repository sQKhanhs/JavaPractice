package TestHashMapHashSet;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student("Khánh", 18, "HCM");
        Student student2 = new Student("Như", 28, "HCM");
        Student student3 = new Student("Sang", 29, "HCM");

        Map<Integer, Student> hashMap = new HashMap<>();
        hashMap.put(1, student1);
        hashMap.put(2, student2);
        hashMap.put(3, student3);
        for (Map.Entry<Integer, Student> entry : hashMap.entrySet())
            System.out.println(entry.getValue().toString());

        Map<Integer, Student> treeMap = new TreeMap<>(hashMap);
        for (Map.Entry<Integer, Student> entry : treeMap.entrySet())
            System.out.println(entry.getValue().toString());

        Set<Student> hashSet = new LinkedHashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        for(Student student: hashSet)
            System.out.println(student);
    }
}
