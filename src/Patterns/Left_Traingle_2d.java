package Patterns;

import java.util.Scanner;

public class Left_Traingle_2d {
    public static void main(String[] args) {
        //we need to print left hand triangle pattern

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n to print the pattern");
        int n = scanner.nextInt();

        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
