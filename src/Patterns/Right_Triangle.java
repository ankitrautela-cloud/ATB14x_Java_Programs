package Patterns;

import java.util.Scanner;

public class Right_Triangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n to form a pattern");
        int n= scanner.nextInt();

        for (int i=0; i<n;i++)
        {
            for (int j=i; j<n-1;j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=i;k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
