/**
 * Rahul Kanwal 3144895
 */
/*
 * This is a regular comment block.
 * The task is to: 
 * 		1. Modify the getDouble method to use exception handling (with an appropriate message displayed) 
 * 				and zero as the default value if a valid number is not entered. (2)
 *
 * @author ACS-2947 Lab 0
 * Adapted from Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 * 
 */

import java.util.Scanner;                  // loads Scanner definition for our use
class InvalidNumber extends Exception{
    @Override
    public String toString() {
        return super.toString()+ " Invalid value; setting value to zero";
    }
}
public class InputExample {
    public static void main(String[] args) {
        System.out.print("Enter your age in years: ");
        double age = getDouble();
        System.out.print("Enter your maximum heart rate: ");
        double rate = getDouble();
        double fb = (rate - age) * 0.65;
        System.out.println("Your ideal fat-burning heart rate is " + fb);
    }

    public static double getDouble() {
        Scanner input = new Scanner(System.in);
        double i;
        if (!input.hasNextDouble()) {
                i=0; //setting value to zero
            try {
                throw new InvalidNumber();
            } catch (InvalidNumber e) {
                System.out.println(e); //printing the appropriate message
            }

        } else {
             i = input.nextDouble();
        }
            return i;
    }

}
