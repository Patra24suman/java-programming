package org.method;

public class StaticMethod {

    static void m1()
    {
        System.out.println("Method1");
        m2();
    }
    static void m2()
    {
        System.out.println("Method2");
        //m1();
    }

    static{
        System.out.println("Static Block");
        m1();
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        m1();
    }

}
