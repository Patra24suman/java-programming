package org.variable;

public class VariableInitialization {

    static int ageOfStudent;
    String nameOfStudent;
    static{
        System.out.println("Static Block");
        ageOfStudent=20;
        System.out.println("Age="+ageOfStudent);
    }
    static void m1(){
        ageOfStudent=30;
        System.out.println("Inside Static Method");
        System.out.println("Age="+ageOfStudent);
    }
    {
        System.out.println("Nonstatic Block");
        nameOfStudent="Shradha";
        System.out.println("Name="+nameOfStudent);
    }
    void m2(){
        nameOfStudent="Neha";
        System.out.println("Inside Nonstatic Method");
        System.out.println("Name="+nameOfStudent);
    }

    public static void main(String[] args) {
        System.out.println("Initialization of variable");
        m1();
        VariableInitialization v=new VariableInitialization();
        v.m2();
    }






}
