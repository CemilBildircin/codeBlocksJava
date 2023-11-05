package Custom_Classes;

import java.util.Scanner;

public class UsingRectangle {
    public static void main(String[] args) {
        Rectangle rectangleFirst = new Rectangle();

        rectangleFirst.base = 14.9;
        rectangleFirst.height = 40.2;

        rectangleFirst.calculatePerimeter();
        rectangleFirst.calculateArea();
    }
}
