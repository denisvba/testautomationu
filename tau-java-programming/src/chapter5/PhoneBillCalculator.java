package chapter5;

import java.util.Scanner;

/*
 * PHONE BILL CALCULATOR
 * Calculate the final total of someone's cell phone bill.
 * Allow the operator to input the plan fee and the number of overage minutes.
 * Charge the user 0.25 for every minute they were over the plan, and 15% tax on the subtotal.
 * Create separate method to calculate the tax, overage fees, and final total.
 * Print the itemized bill.
 */
public class PhoneBillCalculator {

    //What we know
    static double chargingOverageFee = 0.25;
    static double subTotalTax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //What we don't know
        double planFee = getPlanFee();
        int overageMinutes = getOverageMinutes();

        scanner.close();

        //Calculate
        double overageFee = calculateOverageFee(overageMinutes);
        double tax = calculateTax(planFee, overageFee);
        double total = calculateFinalTotal(planFee, overageFee, tax);

        //Notify
        printItemizedBill(planFee, overageFee, tax, total);
    }

    public static double getPlanFee(){
        System.out.println("Enter the base cost of the plan: ");
        double planFee = scanner.nextDouble();
        return planFee;
    }

    public static int getOverageMinutes(){
        System.out.println("Enter the amount of overage minutes: ");
        int overageMinutes = scanner.nextInt();
        return overageMinutes;
    }

    public static double calculateOverageFee(double overageMinutes){
        double overageFee = overageMinutes * chargingOverageFee;
        return overageFee;
    }

    public static double calculateTax(double planFee, double overageFee){
        double tax = (planFee+overageFee)*subTotalTax;
        return tax;
    }

    public static double calculateFinalTotal(double planFee, double overageFee, double tax){
        double total = planFee + overageFee + tax;
        return total;
    }

    public static void printItemizedBill(double plan, double overage, double tax, double total){
        System.out.println("-- Phone Bill Statement --");
        System.out.println("Plan: $" + String.format("%.2f",plan));
        System.out.println("Overage: $" + String.format("%.2f",overage));
        System.out.println("Tax: $" + String.format("%.2f",tax));
        System.out.println("Total: $" + String.format("%.2f",total));
    }
}
