package Strings;

public class String_Ex05 {
    public static void main(String[] args) {
        String s= "java".substring(2);
        System.out.println(s);

        String s1="java".substring(1,3);
        System.out.println(s1);

        char[] arr = "java".toCharArray();
        System.out.println(arr);

        String s3="  java  ".trim();
        System.out.println(s3);

        boolean b="  ".isBlank();
        System.out.println(b);

        String s4="ab".repeat(15);
        System.out.println(s4);

        boolean b1="Java".equalsIgnoreCase("java");
        System.out.println(b1);

        long count = "a\nb\nc\nd\ne".lines().count();
        System.out.println(count);
    }
}
