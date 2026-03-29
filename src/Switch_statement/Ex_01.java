package Switch_statement;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        // You need to take a user input and ask for the integer from 1 to 7.
        // And if user enters 1 to 7,
        // you will tell which day it is.

        // Logic Building Formula

        // Step 1 - Number one is using the Scanner class.
        // Step 2 number two will be basically figuring out the expression and the day.
        // Step 3- We will basically add step 3 as a rough logic.
        // Step 4 - 4 is you will write the fix the logic and optimize.
        // Step 5 - figure out the edge cases.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the day to 1 to 7");

        if (scanner.hasNextInt()){
            int day= scanner.nextInt();
            switch(day){
                case 1:
                    System.out.println("monday");
                    break;
                case 2:
                    System.out.println("tuesday");
                    break;
                case 3:
                    System.out.println("wednesday");
                    break;
                case 4:
                    System.out.println("thursday");
                    break;
                case 5:
                    System.out.println("friday");
                    break;
                case 6:
                    System.out.println("saturday");
                    break;
                case 7:
                    System.out.println("sunday");
                break;
                default:
                    System.out.println("please enter int between 1 and 7");
            }
        }
        else {
            System.out.println("Please enter int value");
        }
    }
}
