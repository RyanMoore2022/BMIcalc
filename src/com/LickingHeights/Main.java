package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

    String name;
    Double inch;
    Double pound;
    Double cm;
    Double kg;
    Double kg2;
    Double cm2;

    System.out.println("Hello, what is your name?");
        name = keyboard.nextLine();
    System.out.println("Hello " +name);
    System.out.println("To calculate your Body Mass Index, just answer these questions.");

    System.out.println("What is your height in inches?");
        inch = keyboard.nextDouble();
    System.out.println("What is your weight in pounds?");
        pound = keyboard.nextDouble();
    System.out.println("Now your BMI will be calculated.");
        cm = 2.54;
        kg = 0.453592;
        kg2 = inch*cm;
        cm2 = pound*kg;
        System.out.println(inch*cm);
        System.out.println(pound*kg);
        System.out.print("Your BMI is ");
        System.out.println(kg2/cm2*cm2);




    }
}
