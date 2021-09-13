/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package org.example;

import java.util.Scanner;

public class ex08 {

    // main
    public static void main(String[] args) {

        // initialize variables and compute slices per person and leftovers
        int people = get_people();
        int pizzas = get_pizza();
        int slices = pizzas * get_slices();
        int slices_per = slices / people;
        int leftover = slices - (slices_per * people);

        // print output
        System.out.println(people + " people with " + pizzas + " pizzas (" + slices + " slices)");
        System.out.println("Each person gets " + slices_per + " pieces of pizza.");
        System.out.println("There are " + leftover + " leftover pieces.");



    }

    // gets number of people
    public static int get_people() {

        // prompt for input and return scan
        System.out.print("How many people? ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }

    // gets number of pizzas
    public static int get_pizza() {

        // prompt for input and return scan
        System.out.print("How many pizzas do you have? ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }

    // gets number of slices per pizza
    public static int get_slices() {

        // prompt for input and return scan
        System.out.print("How many slices per pizza? ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }
}
