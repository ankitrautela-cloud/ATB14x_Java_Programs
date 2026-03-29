package Learning_Java_14x;

public class Pre_Pro_Increment_Operator {
    static void main(String[] args) {
        int a=10;
        int b=++a; // pre increment
        System.out.println(a);
        System.out.println(b);
        int c=++b;
        System.out.println(c);
        int d=c++; // post increment
        System.out.println(c);
        System.out.println(d);
    }
}
