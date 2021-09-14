/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNum = input.nextInt();

        System.out.println("Enter the second number: ");
        int secondNum = input.nextInt();

        System.out.println("Enter the third number: ");
        int thirdNum = input.nextInt();

        int largestNum = 0;

        //checks to see if all numbers are different
        if(firstNum == secondNum && firstNum == thirdNum){
            System.out.println("All three numbers are not different. Exiting program.");
            return;
        }

        if(firstNum > secondNum && firstNum > thirdNum){
            largestNum = firstNum;
        }
        else if(secondNum > firstNum && secondNum > thirdNum){
            largestNum = secondNum;
        }
        else if(thirdNum > firstNum && thirdNum > secondNum){
            largestNum = thirdNum;
        }
        System.out.println("The largest number is " + largestNum +".");
    }
}
