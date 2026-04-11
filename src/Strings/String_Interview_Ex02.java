package Strings;

public class String_Interview_Ex02 {
    public static void main(String[] args) {

        String s1="Ankit";
        String s2="Ankit";
        String s3="Ankit";
        String s4="ankit";

        //👆 2 Strings are present in String constant pool

        String s5= new String("Ankit");
        String s6= new String("Ankit");
        String s7 = new String("ankit");

        //👆 3 Strings are present in heap area
    }
}
