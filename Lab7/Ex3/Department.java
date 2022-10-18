package Lab7.Ex3;

import java.util.Arrays;

public class Department {
    private String name;
    private Student[] students;

    public Department(String name, Student[] students) {
        setName(name);
        setStudents(students);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        String output = "";

        for(int i =0; i < students.length; i++){
            if(students[i] != null){
                output += (students[i] + "   ");
            }
        }

        return output;
    }
}
