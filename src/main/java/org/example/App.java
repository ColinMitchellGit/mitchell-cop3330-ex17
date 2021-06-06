/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colin Mitchell
 */

package org.example;
import java.util.Scanner;
import static java.lang.Double.parseDouble;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your weight? ");
        double weight = parseDouble(input.nextLine());

        System.out.print("What is your gender (M or F)? ");
        String gender = input.nextLine();

        System.out.print("What is the total amount of alcohol you have consumed (in ounces)? ");
        double total_alcohol = parseDouble(input.nextLine());

        System.out.print("How many hours since your last drink? ");
        double hours = parseDouble(input.nextLine());

        double alcohol_ratio;

        if(gender.equals("M")) {
            alcohol_ratio = 0.73;
        }else if(gender.equals("F")) {
            alcohol_ratio = 0.66;
        }else {
            alcohol_ratio = 0;
        }

        double blood_alcohol_content = (total_alcohol * 5.14 / weight * alcohol_ratio) - .015 * hours;

        System.out.println("Your BAC is " + blood_alcohol_content);

        if(blood_alcohol_content >= 0.08) {
            System.out.println("It is not legal for you to drive.");
        }else{
            System.out.println("It is legal for you to drive.");
        }
    }
}
