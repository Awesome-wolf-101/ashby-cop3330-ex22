/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */

import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;
import java.lang.Math;

public class APP {


    public static void main(String[] args) {
        System.out.println("Enter the first number:");
        Scanner sc = new Scanner(System.in);
        String NumOne = sc.nextLine();
        System.out.println("Enter the second number:");
        String NumTwo = sc.nextLine();
        System.out.println("Enter the third number:");
        String NumThree = sc.nextLine();


        int FirstNUM = Integer.parseInt(NumOne);
        int SecondNum = Integer.parseInt(NumTwo);
        int ThirdNum = Integer.parseInt(NumThree);

        if((FirstNUM == SecondNum) || (SecondNum == ThirdNum) || (ThirdNum == FirstNUM))
        {
            System.out.println("These numbers are not unique, please restart the program and try again");
            System.exit(-1);
        }


        double TaxRate = 0;

        int Max = FirstNUM;
        if (SecondNum > Max)
        {
            Max = SecondNum;
        }
        if (ThirdNum > Max)
        {
            Max = ThirdNum;
        }
        System.out.println("The largest number is " + Max + ".");
    }

    }






