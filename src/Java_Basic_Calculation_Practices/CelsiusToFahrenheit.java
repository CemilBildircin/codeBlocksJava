package Java_Basic_Calculation_Practices;

import javax.swing.*;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String [] args){

        double celsius, result;
        Scanner scanner = new Scanner(System.in);
        celsius = Double.parseDouble(JOptionPane.showInputDialog("Enter temperature in Celsius: "));
        result = 1.8 * celsius + 32;

        JOptionPane.showMessageDialog(null, "Temperature in Fahrenheit: " + result);
    }
}
