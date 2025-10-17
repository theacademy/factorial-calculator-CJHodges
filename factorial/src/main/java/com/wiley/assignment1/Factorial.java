package com.wiley.assignment1;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Factorial {

    private Scanner scanner;
    private PrintStream printStream;
    private int num;


    public Factorial(InputStream inputStream, PrintStream printStream) {
        this.scanner = new Scanner(inputStream);
        this.printStream = printStream;
    }

    public int isInputNumberValid() {

        this.printStream.print("Submit a value between 1 and 10: ");

        //Check if input is an int
        if (this.scanner.hasNextInt()) {
            int userInput = this.scanner.nextInt();
            if (userInput >= 1 && userInput <= 10) { //Check if int is between 1 and 10 inclusive
                return userInput; //return valid int
            } else {
                this.printStream.print("Invalid entry. Please enter an integer between 1 and 10, inclusive.");
                return -1;
            }
        } else {
            this.printStream.print("Invalid entry. Please enter an integer between 1 and 10, inclusive.");
            return -1;
        }

    }


    private void calculateFactorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) { //Factorial loop
            result = result * i;
        }

        this.printStream.print("The Factorial is: " + result);

    }

    public void calculateFactorial() {
		 /*
		 Do not change this method.
		 */

        int input = this.isInputNumberValid();
        if(input != -1)
        {
            calculateFactorial(input);
        }

    }


    public static void main(String[] args) {
		/*
		 Do not change this method.
		 */
        Factorial fact = new Factorial(System.in,System.out);
        System.out.println("Enter an integer between 1 and 10, inclusive.");
        fact.calculateFactorial();
    }


}
