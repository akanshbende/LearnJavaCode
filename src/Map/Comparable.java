package Map;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class Student implements java.lang.Comparable<Student> {
    public String name;
    public double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa);  // Ascending GPA
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

public class Comparable {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("Charlie",3.5));
        list.add(new Student("Alice", 3.8));
        list.add(new Student("Bob", 3.2));
        list.add(new Student("Charlie", 3.5));
        list.add(new Student("Diana", 3.9));
        list.add(new Student("Ethan", 2.8));

        list.sort(null);
        System.out.println(list);

    }
}
