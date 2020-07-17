// Area of a rectangle

import java.util.Scanner;

public class ScannerRectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length");
        double l = s.nextDouble();
        System.out.println("Enter teh breadth");
        double b = s.nextDouble();
        double area = l * b;
        System.out.println("Area of a rectangle is: " + area);
    }
}
