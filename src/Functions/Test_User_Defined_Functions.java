package Functions;

import java.util.Scanner;

public class Test_User_Defined_Functions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number a");
        int a = scanner.nextInt();
        System.out.println("Enter number b");
        int b = scanner.nextInt();

        int result= sum_of_two_numbers(a,b);
//        int result1=sum_of_two_numbers(100,48);
//        int result2=sum_of_two_numbers(255,-100);
//        sum_of_two_numbers();

        System.out.println(result);
//        System.out.println(result1);
//        System.out.println(result2);
    }

    static int sum_of_two_numbers(int a , int b){
        return a+b;
    }

    static void sum_of_two_numbers(){
        System.out.println("this is without parameter");    }
}
