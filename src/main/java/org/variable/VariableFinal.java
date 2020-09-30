package org.variable;

public class VariableFinal {
    static final int staticVariable=2;

    final String nonStaticVariable="java";

     static{
        // staticVariable=3;//can not assign a value to a final variable staticVariable
         System.out.println("Value of Static Variable="+staticVariable);
         //System.out.println(nonStaticVariable);//non-static variable can not be referenced from static context
     }
    {
        System.out.println("Value of Non-static Variable="+nonStaticVariable);
    }

    public static void main(String[] args) {
        System.out.println("------------------------------");
       VariableFinal vf=new VariableFinal();

    }






}
