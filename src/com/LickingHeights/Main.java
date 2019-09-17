package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard;
        keyboard = new Scanner(System.in);

    String name;
    Double inch;
    Double pound;

    System.out.println("Hello, what is your name?");
        name = keyboard.nextLine();
    System.out.println("Hello " +name);
    System.out.println("To calculate your Body Mass Index, just answer these questions.");

    System.out.println("What is your height in inches?");
        inch = keyboard.nextDouble();
    System.out.println("What is your weight in pounds?");
        pound = keyboard.nextDouble();

    }
}
