package Lab8.Ex1;

import javax.swing.*;

public class TestVehicle {
    public static void main(String[] args) {

        String output = "";

        Car car1 = new Car();

        output += "Testing the no arg Car constructor\n\n" + car1.toString();

        Car car2 = new Car(10000, 4.5, 1.25, 2000, "Ferrari", "F2", 2, "05KY1");

        output += "\n\n\nTesting the multi arg Car constructor\n\n" + car2.toString();

        JOptionPane.showMessageDialog(null, output);
    }
}
