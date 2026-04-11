package Functions;

public class Test_Simple_Method {
    public static void main(String[] args) {
        non_return_type_function();
        String name = return_string_type();
        System.out.println(name);
        byte b = return_byte();
        System.out.println(b);
        boolean a =return_boolean();
        System.out.println(a);
    }
    static void non_return_type_function(){
        System.out.println("this is no return type function!");
    }

    // Return Type - which return a data type (int, String, char, boolean, float)
    static String return_string_type(){
        System.out.println("String return type");
        return "ankit";
    }

    static boolean return_boolean(){
        return true;
    }

    static float return_float_type(){
        return 3.14f;
    }

    static byte return_byte(){
        return 100;
    }

    static long return_long(){
        return 100l;
    }
}
