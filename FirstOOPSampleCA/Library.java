package FirstOOPSampleCA;

import java.util.Arrays;

public class Library {
    private String name;
    private String address;
    private String librarian;
    private int numberEmployees;
    private String[] book;

    public Library(String name, String address, String librarian, int numberEmployees, String[] book){
        setName(name);
        setAddress(address);
        setLibrarian(librarian);
        setNumberEmployees(numberEmployees);
        setBooks(book);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setLibrarian(String librarian) {
        this.librarian = librarian;
    }
    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }
    public void setBooks(String[] book) {
        this.book = Arrays.copyOf(book,book.length);
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getLibrarian() {
        return librarian;
    }
    public int getNumberEmployees() {
        return numberEmployees;
    }
    public String[] getBook() {
        return book;
    }

    public int getBookCount(){

    }

    public String findBook(){

    }

    public void addBook(){

    }


}
