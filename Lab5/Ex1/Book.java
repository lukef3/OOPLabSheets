package Lab5.Ex1;

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
        if(pages < 0 || pages > 4000) {
            this.pages = 0;
        }
    }

    private void setISBN(String ISBN) {
        if(ISBN.equals("")){
            this.ISBN = "No Valid ISBN Supplied";
        }
    }

    private void setPrice(double price) {
        if(price < 0 || price > 50) {
            this.price = 0;
        }
    }

    private void setTitle(String title) {
        if(title.equals("")){
            this.title = "No Valid Title Supplied";
        }
    }

    public String toString(){
        return "Title: " + getTitle() + "\nPrice: " + getPrice() + "\nISBN: " + getISBN() + "\nPages: " + getPages();
    }


}
