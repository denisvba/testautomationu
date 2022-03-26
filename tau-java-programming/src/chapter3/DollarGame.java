package chapter3;

/*
* The objective of the gam is to enter enough change
* to equal exactly $1! Create a program that asks a
* user to enter the quantities for the following coins:
* pennies, nickels, dimes and quarters. Your program should
* count up the value of all the change. If it's exactly $1,
* they win! If it is more the $1, tell them by how much they
* went over. If it's less than $1, tell them by how much they
* went under. fell fre to change the game for your country's
* currency!
*
* */

import java.util.Scanner;

public class DollarGame {

    public static void main(String[] args) {

        // You'll ask them how many pennies would you like?
        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        // How many nickels would you like?
        System.out.println("How many nickels would you like?");
        int nickels = scanner.nextInt();
        // How many dimes?
        System.out.println("How many dimes would you like?");
        int dimes = scanner.nextInt();

        // And then, how many quarters?
        System.out.println("How many quarters would you like?");
        int quarters = scanner.nextInt();

        scanner.close();
        // What your program is going to do is count up the value of all of the change that they answered.
        double change = 0;
        if (pennies != 0)
            change = change + (pennies*0.01);
        if (nickels != 0)
            change = change + (nickels*0.5);
        if (dimes != 0)
            change = change + (dimes*0.10);
        if (quarters != 0)
            change = change + (quarters*0.25);


        // If it's exactly one dollar then they win the game.
        if (change == 1.0)
            System.out.println("You win! You got exactly $1");
        // If it's more than one dollar, then you need to tell them that it's more than one dollar and how much they went over.
        else if (change > 1.0) {
            change = change - 1;
            System.out.println("You lose! You got more than $1. You went $" + String.format("%.2f",change) + " over.");
        }
        // If it's less than one dollar, tell them how much they went under.
        else {
            change = 1.0 - change;
            System.out.println("You lose! You got less than $1. You went $" + String.format("%.2f",change) + " under.");
        }
    }
}
