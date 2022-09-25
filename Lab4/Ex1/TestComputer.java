package Lab4.Ex1;

import javax.swing.*;

public class TestComputer {
    public static void main(String[] args) {
        String output = "";

        Lab4.Ex1.Computer c1 = new Lab4.Ex1.Computer();

        output += "== Calling the no-argument Computer constructor ==" +
                "\n\nThe first Computer object details are: \n\n" + c1.toString();

        /*Lab4.Ex1.Computer c2 = new Lab4.Ex1.Computer("Dell", "Laptop", -3.15, 16, 550.99);

        output += "\n\n\n\n== Calling the multi-argument Computer constructor ==" +
                "\n\nThe second Computer object details are: \n\n" + c2.toString();

        Lab4.Ex1.Computer c3 = new Computer("Apple", "Tablet", 3.65, -16, -500.25);

        output += "\n\n\n\n== Calling the multi-argument Computer constructor ==" +
                "\n\nThe third Computer object details are: \n\n" + c3.toString();*/

        JOptionPane.showMessageDialog(null, output, "Computer Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
