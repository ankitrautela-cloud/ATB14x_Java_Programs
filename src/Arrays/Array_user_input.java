package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_user_input {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array(int)");
        int size=scanner.nextInt();

        String[] marks=new String[size];

        for (int i=0;i<marks.length;i++)
        {
            System.out.println("Enter the elements -> "+i);
            marks[i]=scanner.next();
        }

        System.out.println("---print the values--");

        Arrays.sort(marks);
        for (String marks_value : marks){
            System.out.println(marks_value);
        }
    }
}
