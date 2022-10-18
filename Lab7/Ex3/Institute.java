package Lab7.Ex3;

import java.util.Arrays;

public class Institute {
    private String name;
    private Department[] departments;

    public Institute(String name, Department[] departments) {
        setName(name);
        setDepartments(departments);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public int getTotalStudents(){

        int total = 0;
        Student[] students;


        for(int i = 0; i < departments.length; i++){
            if(departments[i] != null){
                students = departments[i].getStudents();
                for(int j = 0; j < students.length; j++){
                    if(students[j] != null){
                        total++;
                    }
                }
            }
        }
        return total;
    }

    @Override
    public String toString() {
        String output = "";

        for(int i =0; i < departments.length; i++){
            if(departments[i] != null){
                output += (departments[i] + "   ");
            }
        }

        return output;
    }
}
