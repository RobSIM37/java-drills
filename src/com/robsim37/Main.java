package com.robsim37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Part 1
        String firstName = "Lay";
        String lastName = "Jeno";
        String birthYear = "60bby";
        String homeWorld = "Forest moon of Endor";
        int heightInInches = 70;
        int weightInPounds = 225;

        // Part 2
        float purse = 150.0f;

        float droidCost = 24.3f;
        float bootsCost = 45.0f;
        float diceMultiplier = 2.0f;
        float lightSaberCostMultiplier = 0.1f;

        purse -= droidCost;
        purse -= bootsCost;
        purse *= diceMultiplier;
        purse -= purse * lightSaberCostMultiplier;

        System.out.println("Remaining money in purse: " + purse);

        // Part 3
        String lightSabreHandleColor = "black";
        String lightSabreBladeColor = "purple";

        if (lightSabreHandleColor.equalsIgnoreCase("black") && lightSabreBladeColor.equalsIgnoreCase("purple")) {
            System.out.println("This one’s mine!");
        } else {
            System.out.println("Pass");
        }

        String availableShip = "Slave-1";
        String desiredShip = "Millennium Falcon";

        if (desiredShip.equalsIgnoreCase(availableShip)) {
            System.out.println("let’s go");
        } else {
            System.out.println("I better hide somewhere.");
        }

        float itemCost = 4.0f;
        boolean recommended = false;

        if (itemCost < 5.0f && recommended) {
            System.out.println("I'll try that");
        } else {
            System.out.println("No thanks");
        }

        float drinkCost = 0.9f;
        float drinkSize = 20.0f;

        if (drinkCost < 1.0f || drinkSize > 24.0f) {
            System.out.println("I'll order that");
        } else {
            System.out.println("Not enough value");
        }

        // Part 4
        // fizzBuzz100(); - Broken, as stated in the comments.

        // Any solution for FizzBuzz that is expandable, ie you can add more conversions, isn't going to use a switch statement
        Map<Integer, String> conversions = new HashMap<>();
        conversions.put(3, "fizz");
        conversions.put(5, "buzz");
        conversions.put(7, "bang");
        conversions.put(11, "fuzz");
        conversions.put(13, "fang");

        List<String> fbResults = fizzBuzz(conversions, 100);
        for (String result : fbResults) {
            System.out.println(result);
        }

    }

    private static void fizzBuzz100() {
        for (int i = 1; i <= 100; i++) { // loops through the ints between 1 and 100 inclusively
            if ((i % 3) == 0) // if the int is evenly divisible by 3...
                System.out.println("fizz"); // ...print "fizz" to the console window
            else if ((i % 5) == 0) // If the int is evenly divisible by 5...
                System.out.println("buzz"); // ... print "buzz" to the console window
            else if (((i % 5) == 0) && ((i % 3) == 0)) // This will never execute because if both are true, one of the previous lines of code would have run instead
                System.out.println("fizzbuzz"); // When this code is restructured, this will print "fizzbuzz" when the number is divisible by 15
            else // handles the default case where the int is not divisible by 3, 5, or 15
                System.out.println(i); // simply print the number
        }
    }

    private static List<String> fizzBuzz(Map<Integer, String> conversions, int countTo) {

        List<String> result = new ArrayList<>();

        for (int currentNumber=1; currentNumber<=countTo; currentNumber++) {

            StringBuilder output = new StringBuilder();
            for (Map.Entry<Integer, String> entry : conversions.entrySet()) {
                if (currentNumber % entry.getKey() == 0) {
                    output.append(entry.getValue());
                }
            }

            if (output.toString().equals("")) {
                output.append(currentNumber);
            }

            result.add(output.toString());

        }

        return result;

    }

    private static void helloWorld () {
        System.out.println("Hello World!");
    }

    private static void greeting (String name) {
        System.out.println("Hello, " + name);
    }

    private static int add (int num1, int num2) {
        return num1 + num2;
    }

    private static String faveColorFinder (String color) {
        return switch (color) {
            case "red" -> "red is a great color";
            case "green" -> "green is a solid favorite color";
            case "black" -> "so trendy";
            default -> "you need to evaluate your favorite color choice";
        };
    }

    private static String thatsOdd (int number) {
        if (number % 2 == 0) {
            return "That's not odd";
        } else {
            return "That is odd indeed!";
        }
    }

    private static String[] bigOrSmall (int[] arr) {
        String[] answers = new String[arr.length];

        for (int i=0; i<arr.length; i++) {
            if (arr[i] > 100) {
                answers[i] = "big";
            } else {
                answers[i] = "small";
            }
        }

        return answers;

    }
}
