package Interview_question;

import java.util.Scanner;

public class String_Reverse_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String input to reverse");
        String user_input = sc.next();

//        StringBuilder sb= new StringBuilder(user_input);
//        System.out.println(sb.reverse());

        String reverse_user_input="";

        for (int i = user_input.length()-1;i>=0;i--)
        {
            reverse_user_input = reverse_user_input + user_input.charAt(i);
        }
        System.out.println(reverse_user_input);
    }

}
