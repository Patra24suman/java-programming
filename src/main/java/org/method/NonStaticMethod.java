package org.method;

public class NonStaticMethod {
    void m1(){
        System.out.println("Inside NonStatic Method1");
    }

    void m2(){
        System.out.println("Inside NonStatic Method2");
        m1();
    }
    {
        System.out.println("NonStatic Block");
        m1();
    }


    public static void main(String[] args) {
        System.out.println("Main Method");
        NonStaticMethod n=new NonStaticMethod();
        n.m1();
    }

}
