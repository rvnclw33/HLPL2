package university;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Student implements Comparable<Student> {
    private final String name;
    private final String id;
    private double gpa;

    public Student(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public Student(String name, String id) {
        this(name, id, 2.5);
    }

    // Student(String line) ***
    public Student(String line) {
        String[] tokens = line.split(";");
        name = tokens[0];
        id = tokens[1];
        gpa = Double.parseDouble(tokens[2]);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name + ";" + id + ";" + gpa;
    }

    // sncf
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(id, student.id);
    }

    // another hashcode convention
    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    /*
    Negative → this < other
    Zero → this == other
    Positive → this > other
    */

    @Override
    public int compareTo(Student o) {
        // if both values are not equal then, compare them using compare
        // descending
        if ( this.gpa != o.gpa ) {
            return -Double.compare(this.gpa, o.gpa);
        }

        // ascending
        if (!Objects.equals(this.name, o.name)) {
            return this.name.compareTo(o.name);
        }

        // ascending
        return this.id.compareTo(o.id);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // change Student[] to new String
        Student[] students = new Student[100];
        int length = 0;

        while(true) {
            String line = scanner.nextLine();

            if(Objects.equals(line, "END")) break;

            students[length] = new Student(line);
            length++;
        }

        Arrays.sort(students, 0, length);

        for (int i = 0; i < length; i++) {
            System.out.println(students[i]);
        }
    }
}
