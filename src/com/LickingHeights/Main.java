package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

    String name;
    Double inch;
    Double pound;
    int imp;

    System.out.println("Hello, what is your name?");
        name = keyboard.nextLine();
    System.out.println("Hello " +name);
    System.out.println("To calculate your Body Mass Index, just answer these questions.");

    System.out.println("What is your height in inches?");
        inch = keyboard.nextDouble();
    System.out.println("What is your weight in pounds?");
        pound = keyboard.nextDouble();
    System.out.println("Now your BMI will be calculated.");
        imp = 703;

        System.out.println(" ");
        System.out.println("Your Body Mass Index is:");
        System.out.print(imp*pound/(inch*inch));

    System.out.println(" ");
    System.out.println("For the average adult, 20-24 is normal.");
    System.out.println("For women, less than or equal to 19 is underweight.");
    System.out.println("For men, less than 20 is underweight.");
    System.out.println("25-29 is overweight");
    System.out.println("30-39 is obese");
    System.out.println("Over 40 is extreme obesity.");



    }
}
