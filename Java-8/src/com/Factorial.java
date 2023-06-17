package com;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = input.nextInt();
        long factorial = 1; // initialize factorial to 1

        for (int i = 1; i <= number; i++) {
            factorial *= i; // multiply factorial with each number from 1 to number
        }

        System.out.println("Factorial of " + number + " is " + factorial);
        input.close();
    }
}

