package StringBuilder_Buffer;

public class Append_with_Reverse {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("ankit");
        sb.append(" rautela");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
