package Strings;

public class String_Ex06 {
    public static void main(String[] args) {
        String s1="java program";
        char c= s1.charAt(5);
        System.out.println(c);

        int result= "abc".compareTo("ABC");
        System.out.println(result);

        int index="java".indexOf("v");
        System.out.println(index);

        int index2="java".lastIndexOf("a");
        System.out.println(index2);

        boolean b3="".isEmpty();
        System.out.println(b3);

        String s2= String.join("--", "java", "python");
        System.out.println(s2);

        String s3="java".replace("a","o");
        System.out.println(s3);

        boolean b4="java".startsWith("Ja");
        System.out.println(b4);

        String s4="java".concat("mava");
        System.out.println(s4);
    }
}
