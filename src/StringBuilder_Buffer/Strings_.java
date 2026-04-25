package StringBuilder_Buffer;

public class Strings_ {
    public static void main(String[] args) {
        String name = "Ankit";

        System.out.println(name.length());
        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException: Index 10 ou

        // 2. concat()
        System.out.println(name.concat(" Rautela"));

        // 3. contains()
        System.out.println(name.contains("om"));

        // 4. equals()
        System.out.println(name.equals("Ankit"));

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("ankit"));

        // 6. indexOf() //
        System.out.println(name.indexOf('k'));

        String s1 = "Sir";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("r"));

        // 7. length()
        System.out.println(name.length());

        // 8. replace( , )
        System.out.println(name.replace('n', 'N'));

        // 10. substring( , )
        System.out.println(name.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("ANKIT".toLowerCase());

        // 12. toUpperCase()
        System.out.println("ankit".toUpperCase());

        // 14. startsWith()
        System.out.println(name.startsWith("X"));

        // 15. endsWith()
        System.out.println(name.endsWith("Z"));

        // 16. trim()
        String name3 = "    Ankit Rautela     ";
        System.out.println(name3.trim());

        // 17. compareTo()
        System.out.println(name.compareTo("Ankit"));


        // --------------
        StringBuilder stringBuilder = new StringBuilder("Ankit");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());




    }
}
