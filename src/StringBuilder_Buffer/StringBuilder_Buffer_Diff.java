package StringBuilder_Buffer;

public class StringBuilder_Buffer_Diff {
    public static void main(String[] args) {
        String s1="Ankit";          //used in 90% cases
        String s2=new String("Ankit"); //used in 90% cases

        StringBuilder sb= new StringBuilder("Ankit"); //used in 10% cases
        StringBuffer sb1 = new StringBuffer("ankit"); //used in 10% cases

        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb1);
        System.out.println(sb1.reverse());
    }
}
