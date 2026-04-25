package OOPs_Inheritance.single_inheritance.single_inheritance;

public class F_S_inheritance {
    public static void main(String[] args) {
        Son abc = new Son();
        System.out.println(abc.gold_f);
        abc.bhk2();
        abc.bhk3();

        Father f1=new Father();
        f1.bhk2();
//        f1.bhk3;
    }
}
