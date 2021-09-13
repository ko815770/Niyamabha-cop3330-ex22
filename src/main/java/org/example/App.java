package org.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kontawat Niyamabha
 */
public class App
{
    public static void main( String[] args )
    {
        int first, second, third;
        System.out.println("Enter the first number: ");
        Scanner input = new Scanner(System.in);
        first = input.nextInt();
        System.out.println("Enter the second number: ");
        second = input.nextInt();
        System.out.println("Enter the third number: ");
        third = input.nextInt();
        if (first != second || first != third)
        {
            if (second > first)
            {
                first = second;
                if (third > first)
                {
                    first = third;
                }
            }
            else if (third > first)
            {
                first = third;
            }
            System.out.println("The largest number is " + first + ".");
        }
    }
}