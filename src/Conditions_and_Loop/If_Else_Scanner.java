package Conditions_and_Loop;

import java.util.Scanner;

public class If_Else_Scanner {
    static void main(String[] args) {
        //How to take user input
        //1. CLI options
//         int age = Integer.parseInt(args[0]);

//       2.Scanner Class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println(age);
    }
}
