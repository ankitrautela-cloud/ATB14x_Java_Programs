package Strings;

public class String_Creation {
    public static void main(String[] args) {
         String s1= "Ankit"; //String constant pool
         String s2= new String("Ankit"); //Heap area
        System.out.println(s1);
        System.out.println(s2);
    }
}
