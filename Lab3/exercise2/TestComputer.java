package Lab3.exercise2;

import javax.swing.*;

public class TestComputer {
    public static void main(String[] args) {
        String output = "";

        Lab3.exercise2.Computer c1 = new Lab3.exercise2.Computer();

        output += "== Calling the no-argument Computer constructor ==" +
                "\n\nThe first Computer object details are: \n\n" + c1.toString();

        Lab3.exercise2.Computer c2 = new Lab3.exercise2.Computer("Dell", "Laptop", 3.25, 16, 550.99);

        c2.setSpeed(-3.15);

        output += "\n\n\n\n== Calling the multi-argument Computer constructor ==" +
                "\n\nThe second Computer object details are: \n\n" + c2.toString();

        Lab3.exercise2.Computer c3 = new Lab3.exercise2.Computer("Apple", "Desktop", 2.9, 12, 865.00);

        c3.setRAM(-8);

        output += "\n\n\n\n== Calling the multi-argument Computer constructor ==" +
                "\n\nThe third Computer object details are: \n\n" + c3.toString();

        JOptionPane.showMessageDialog(null, output, "Computer Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
