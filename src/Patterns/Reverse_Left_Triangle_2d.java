package Patterns;

import java.util.Scanner;

public class Reverse_Left_Triangle_2d {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter n to get pattern");
        int n= scanner.nextInt();

        for (int i=n; i>=1; i--)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
