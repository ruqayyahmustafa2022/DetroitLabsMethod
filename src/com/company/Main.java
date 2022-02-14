package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Write a method that accepts one number as a parameter and returns "Detroit", "Labs", "DetroitLabs", or the number
	 based on the following rules:

    Return
    "Detroit" if the number is evenly divisible by 3
    "Labs" if the number is evenly divisible by 5
    "DetroitLabs" if the number is evenly divisible by 15
    In all other cases, return the number

    Test Cases

    Input		Result
    1 		1
    2 		2
    3 		Detroit
    4 		4
    5 		Labs
    6 		Detroit
    10 		Labs
    15 		DetroitLabs

    Bonus: Write a program that tests your method by asking the user to input a number, and running your method with the
    user's number as a parameter. Ex:

    Program: Hello! Please enter a number:
    (User types 30)
    Program: DetroitLabs

	*/
        System.out.println("Hello! Please enter a number: ");
        Scanner usrInput = new Scanner(System.in);
        int numInput = usrInput.nextInt();


        //test for modulus 3 & 5
        if(numInput % 3 == 0  && numInput % 5 == 0)
            System.out.println("DetroitLabs");

        else if(numInput % 3 == 0)
                System.out.println("Detroit");
        else if(numInput % 5 == 0)
                System.out.println("Labs");
        else
            System.out.println(numInput);

        }

    }
