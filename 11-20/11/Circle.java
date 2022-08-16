/*
Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/

// Original with set number
public class Circle{
    private static final double radius = 7.5;

    public static void main(String[] args) {
        // equation for perimeter is p = 2πr
        double perimeter = 2 * Math.PI * radius;
        // equation for area is a = πr²
        double area = Math.PI * radius * radius;

        // Outputting the results.
        System.out.println("Radius = " + radius);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}

// Intaking a number in order to figure it out
/*
 Equations are as follows:
 perimeter = 2πr
 area = πr²
 */
// import java.util.Scanner;

// public class Circle {
//     public static void main(String[] args){
//         // Create a scanner to intake input
//         Scanner input = new Scanner(System.in);

//         System.out.println("Enter a number to use for the radius: ");
//         double radius = input.nextDouble();
//         // p = 2πr
//         double perimeter = 2 * Math.PI * radius;
//          // a = πr²
//         double area = Math.PI * radius * radius;

//         System.out.println("The radius is: " + radius);
//         System.out.println("The perimeter is: " + perimeter);
//         System.out.println("The area is: " + area);

//         input.close();
//     }
// }

