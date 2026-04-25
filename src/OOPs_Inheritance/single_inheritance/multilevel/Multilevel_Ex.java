package OOPs_Inheritance.single_inheritance.multilevel;

public class Multilevel_Ex {
    public static void main(String[] args) {
        Son s1= new Son();
        s1.money();
        s1.car();
        s1.bike();
        s1.property1();
        s1.property();

        Father f1= new Father();
        f1.property();
        f1.bike();
        f1.property1();

        GrandFather gf= new GrandFather();
        gf.property();
        gf.bike();

        //Dynamic Dispatch
        GrandFather g1= new Son();
        Father f2 = new Son();
//        Son s2 = new GrandFather(); //NP
//        Son s3 = new Father(); //NP
    }
}
