package org.variable;

public class Test {
    static int x ;
    String y ;


    static {
        System.out.println("Value of X=" + x);
        //System.out.println(y);
    }

    {

        System.out.println("Value of X=" +x);
        System.out.println("Value of Y="+y);
    }
    static void m1()
    {
        System.out.println("Inside Static Method");
        System.out.println("Value of X=" +x);
       // System.out.println("Value of Y="+y);
    }

    void m2()
    {
        System.out.println("Inside NonStatic Method");
        System.out.println("Value of X=" +x);
        System.out.println("Value of Y="+y);
    }


    public static void main(String[] args) {


        System.out.println("Inside Main Method");
        System.out.println("Value of X=" +x);
       // System.out.println("Value of Y="+y);

        Test t=new Test();
        t.m2();
        m1();
    }
}