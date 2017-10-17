package com.codeup;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = input.nextLine();

        System.out.printf("You entered: \"%s\"\n", userInput);

        System.out.printf("\"%s\" is %s number\n", userInput, StringUtils.isNumeric(userInput) ? "a" : "not a");

        System.out.printf("Flipped case: \"%s\"\n", StringUtils.swapCase(userInput));

        System.out.printf("Reversed: \"%s\"\n", StringUtils.reverse(userInput));
    }
}
