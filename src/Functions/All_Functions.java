package Functions;

public class All_Functions {
    public static void main(String[] args) {
        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4.With Parameters and With Return Type

        wop_wor();
        String type2 = wop_wr();
        System.out.println(type2);

        wp_wor("Ankit", 30, 100000);

        int sum1= sum_of_two_numbers(100,200);
        float sum2= sum_of_three_numbers_float(10.33F,20.33f, 20.44f);
        System.out.println(sum1);
        System.out.println(sum2);

    }

    // 1. Without Parameters and Without Return Type. (Declare) /Define
        static void wop_wor(){
            System.out.println("This is Type 1: Without Parameters and Without Return Type ");
        }

    //  2. Without Parameters but With Return Type
        static String wop_wr(){
            System.out.println("This is Type 2:Without Parameters but With Return Type ");
            return "Type 2 this one";
        }

    //  3. With Parameters and Without Return Type ( 90%)
        static void wp_wor(String name, int age , double salary){
            System.out.println("your name is ->"+name+ "\nyour age is ->"+age + "\nyour salary is ->"+salary);
        }

    //  4. With Parameters and With Return Type
        static int sum_of_two_numbers(int a, int b){
            return a+b;
        }

        static float sum_of_three_numbers_float(float a, float b, float c){
            return a+b+c;
        }



}
