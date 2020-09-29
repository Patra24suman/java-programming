package org.method;

public class ParameterizedMethod {

    static int Sum(int x,int y)
    {
        System.out.println("Sum Method");
        int sum=x+y;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        int Result= Sum(10,20);
        System.out.println("Result="+Result);
    }


}
