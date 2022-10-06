package Lab6.Ex1;

import javax.swing.*;

public class TestPerson {
    public static void main(String[] args) {

        Person P1 = new Person();

        String output = "*****Person Class Tester*****\n\nCalling the Person() constructor....." + P1.toString();

        String secondFirstName = JOptionPane.showInputDialog("Please enter the first name of the second person");
        String secondLastName = JOptionPane.showInputDialog("Please enter the first name of the second person");

        Person P2 = new Person(secondFirstName, secondLastName);

        output += "\n\nCalling the Person(String, String) constructor after getting user-supplied values....." + P2.toString();

        JOptionPane.showMessageDialog(null, output);
    }
}
