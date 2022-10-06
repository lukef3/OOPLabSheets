package Lab6.Ex1;

public class Person {
    private String firstName;
    public String lastName;

    public Person() {
        this("Not Supplied", "Not Supplied");
    }

    public Person(String firstName, String lastName){
        setName(firstName, lastName);
    }

    private void setName(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }
    private void setLastName(String lastName) {
        this.lastName = lastName;
    }
    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String toString(){
        return "\nValue of the first Person object is: First name: " + getFirstName() + "    Last Name: " + getLastName();
    }
}
