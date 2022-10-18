package Lab7.Ex3;

public class TestCollegeApp {
    public static void main(String[] args) {
        String output = "";

        Student s1 = new Student(154345, "Jake", "Computing");
        Student s2 = new Student(234532, "Mary", "Creative Media");
        Student s3 = new Student(453726, "Tommy", "Computing");
        Student s4 = new Student(623456, "Peter", "Creative Media");

        Student ComputingStudents[] = new Student[10];
        ComputingStudents[0] = s1;
        ComputingStudents[1] = s3;

        Student MediaStudents[] = new Student[10];
        MediaStudents[0] = s2;
        MediaStudents[1] = s4;

        Department computing = new Department("Computing", ComputingStudents);
        Department media = new Department("Media", MediaStudents);

        Department Departments[] = new Department[5];
        Departments[0] = computing;
        Departments[1] = media;

        Institute institutes = new Institute("MTU Tralee", Departments);

        System.out.println(institutes);
        System.out.println("Total Students: " + institutes.getTotalStudents());

    }
}
