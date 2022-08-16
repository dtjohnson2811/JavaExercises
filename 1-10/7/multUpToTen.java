/*
 Write a Java program that takes a number as input and prints its multiplication table upto 10. 
 Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/

import java.util.Scanner;

public class multUpToTen{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Asking for the number to multiply up to
        System.out.print("Enter the number here: ");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i +  " = " + result);
        }
    }
}