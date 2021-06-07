/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Alice Yu
 */
package base;
import java.util.Scanner;

/*
Exercise 22 - Comparing Numbers
Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not different, then exit the program. Otherwise, display the largest number of the three.

Example Output
Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.
Constraint
Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.

Challenges
Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s already been entered.
Modify the program so that it asks for ten numbers instead of three.
Modify the program so that it asks for an unlimited number of numbers.

 */

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App myApp = new App();

        int n1 = myApp.readInputInteger("Enter the first number: ");
        int n2 = myApp.readInputInteger("Enter the second number: ");
        int n3 = myApp.readInputInteger("Enter the third number: ");

        if (n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        if (n3 >= n1 && n3 >= n2)
            System.out.println(n3 + " is the largest number.");

    }

    public int readInputInteger(String input)
    {
        System.out.print(input);
        String num = in.next();
        return Integer.parseInt(num);
    }

}
