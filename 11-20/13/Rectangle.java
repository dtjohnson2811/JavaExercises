/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20 
*/

// Using set numbers to find the area and perimeter.
/*
The equations are as follows:
    P = (H + W) * 2 where P represents parameter, H represents height, and W represents width.
    A = W * H 
*/
public class Rectangle{
    public static void main(String[] args) {
        // the set width and height
        final double width = 5.6;
        final double height = 8.5;

        double area = width * height;
        double perimeter = 2 * (height + width);

        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is " + 2 + " * " + "(" + width + " + " + height + ") =" + perimeter);
        
    }
}