package Arrays;

public class Ex_01 {
    public static void main(String[] args) {
        int a = 10; //not an array
        int[] marks = {90, 92, 94, 100, 45, 38};
        Boolean[] is_married = {true, true, false};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);

//        System.out.println(marks[-1]); //java.lang.ArrayIndexOutOfBoundsException

        String name = "Ankit";
        String[] name_each_element = name.split("");

        for (String s : name_each_element) {
            System.out.println(s);
        }
    }
}