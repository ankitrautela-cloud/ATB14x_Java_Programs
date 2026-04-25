package StringBuilder_Buffer;

public class Sb_Replace {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println(sb);

        sb.replace(0,4,"Python");
        System.out.println(sb);
    }
}
