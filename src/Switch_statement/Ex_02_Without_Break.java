package Switch_statement;

import java.util.Scanner;

public class Ex_02_Without_Break {
    public static void main(String[] args) {
        //without break keyword all the later code will also get executed within the block
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the day to 1 to 7");

        if (scanner.hasNextInt()){
            int day= scanner.nextInt();
            switch(day){
                case 1:
                    System.out.println("monday");
//                    break;
                case 2:
                    System.out.println("tuesday");
//                    break;
                case 3:
                    System.out.println("wednesday");
//                    break;
                case 4:
                    System.out.println("thursday");
//                    break;
                case 5:
                    System.out.println("friday");
//                    break;
                case 6:
                    System.out.println("saturday");
//                    break;
                case 7:
                    System.out.println("sunday");
//                    break;
                default:
                    System.out.println("please enter int between 1 and 7");
            }
        }
        else {
            System.out.println("Please enter int value");
        }
    }
}
