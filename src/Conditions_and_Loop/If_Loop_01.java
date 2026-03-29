package Conditions_and_Loop;

public class If_Loop_01 {
    static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age>25)
        {
            System.out.println("You can drive");
        }
        else
        {
            System.out.println("You cannot drive");
        }
    }
}
