package Lab4.Ex4;

public class Book {
    private String title;
    private double price;
    private String ISBN;
    private int pages;

    public Book(){
        this("Not available", 0.0, "Not available", 0);
    }

    public Book(String title, double price, String ISBN, int pages){
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
    }


    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public String getISBN(){
        return ISBN;
    }
    public int getPages(){
        return pages;
    }


    private void setPages(int pages) {
        this.pages = pages;
    }

    private void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public String toString(){
        return "Title: " + getTitle() + "\nPrice: " + getPrice() + "\nISBN: " + getISBN() + "\nPages: " + getPages();
    }


}
