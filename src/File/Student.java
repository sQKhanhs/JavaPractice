package File;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
    public static void writeDataToFile(String path, ArrayList<Student> students){
        try {
            FileOutputStream os = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(students);
            oos.close();
            os.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return students;
    }
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Khánh", 23, "HCM"));
        students.add(new Student("Như", 28, "HCM"));
        students.add(new Student("Hương", 25, "HCM"));
        writeDataToFile("D:\\module02AdvancedJava\\JavaPractice2\\result.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("D:\\module02AdvancedJava\\JavaPractice2\\result.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }
}
