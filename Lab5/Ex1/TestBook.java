package Lab5.Ex1;

import Lab4.Ex5.Book;
import Lab3.exercise1.Computer;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {

        Computer c1 = new Computer(); System.out.println(c1.getManufacturer());

        String favBook,leastBook,favISBN,leastISBN;
        double favPrice,leastPrice;
        int favPages, leastPages;

        favBook = JOptionPane.showInputDialog("Please enter the title of your favourite book");
        favPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favourite book"));
        favISBN = JOptionPane.showInputDialog("Please enter the ISBN of your favourite book");
        favPages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages in your favourite book"));

        leastBook = JOptionPane.showInputDialog("Please enter the title of your least favourite book");
        leastPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your least favourite book"));
        leastISBN = JOptionPane.showInputDialog("Please enter the ISBN of your least favourite book");
        leastPages = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of pages in your least favourite book"));

        Book fav = new Book(favBook, favPrice, favISBN, favPages);

        String output = "Favourite Book:\n" + fav.toString();

        Book leastFav = new Book(leastBook, leastPrice, leastISBN, leastPages);

        output += "\n\nLeast Favourite Book:\n" + leastFav.toString();

        JOptionPane.showMessageDialog(null, output, "Book Object Data", JOptionPane.INFORMATION_MESSAGE);
    }
}

