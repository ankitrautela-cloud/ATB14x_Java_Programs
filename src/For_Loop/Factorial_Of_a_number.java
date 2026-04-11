package For_Loop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial_Of_a_number {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();

        int factorial = 1;
        if (n==0){
            factorial=1;
        }
        for (int i = n; i>=1; i--) {
            factorial=factorial*i;

        }
//        for (int i = 1; i <=n ; i++) {
//            factorial=factorial*i;
//        }
        System.out.println(factorial);
    }
}
