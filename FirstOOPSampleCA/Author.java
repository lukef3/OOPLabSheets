package FirstOOPSampleCA;

public class Author {
    private static int authorID;
    private int authorNumber;
    private String firstName;
    private String surname;

    public Author(String firstName, String surname){
        setFirstName(firstName);
        setSurname(surname);
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    private void setSurname(String surname) {
        this.surname = surname;
    }

    private static void incrementAuthorID(){
        authorID++;
    }
}
