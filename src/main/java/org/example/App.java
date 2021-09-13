/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Vishal Choday
 */

//Exercise 2 - Counting the Number of Characters
        //Create a program that prompts for an input string and displays output that shows the input string and the number of characters the string contains.

        //Example Output
        //What is the input string? Homer
        //Homer has 5 characters.
        //Constraints
        //Be sure the output contains the original string.
        //Use a single output statement to construct the output.
       // Use a built-in function of the programming language to determine the length of the string.

package base;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner inputting = new Scanner(System.in);

        System.out.print("What is the input string? ");
        String input = inputting.nextLine();
        int ourlength = input.length();

        System.out.print(input + " has " + ourlength + " characters.");
    }
}

