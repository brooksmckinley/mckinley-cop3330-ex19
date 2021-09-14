/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight = promptDouble("What is your weight? ", scan);
        double height = promptDouble("What is your height? ", scan);

        System.out.println(bmiReport(weight, height));
    }

    public static double promptDouble(String prompt, Scanner scan) {
        while (true) {
            System.out.print(prompt);
            try {
                double res = Double.parseDouble(scan.nextLine());
                return res;
            } catch (Exception e) {
                // Handle user putting something that isn't a number
                System.out.println("Please enter a number.");
            }
        }
    }

    public static String bmiReport(double weight, double height) {
        double bmi = (weight / (height * height)) * 703;

        String BMIString = "Your BMI is " + bmi + ".\n";
        if (bmi < 18.5) {
            return BMIString + "You are underweight. You should see your doctor.";
        } else if (bmi > 25.0) {
            return BMIString + "You are overweight. You should see your doctor.";
        } else {
            return BMIString + "You are within the ideal weight range.";
        }
    }
}