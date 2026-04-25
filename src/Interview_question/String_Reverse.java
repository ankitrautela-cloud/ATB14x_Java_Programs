package Interview_question;

import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {
        // Write a program to reverse a string without using inbuilt functions.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a input String to reverse");
        String user_input = scanner.next();
//        System.out.println(user_input);

        String reverse_user_input="";

        char[] arr = user_input.toCharArray();

        for (int i=arr.length -1; i>=0; i--)
        {
            reverse_user_input=reverse_user_input+arr[i];
        }
        System.out.println(reverse_user_input);
    }
}
