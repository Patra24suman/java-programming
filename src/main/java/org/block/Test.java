package org.block;
/*

*Static block and Non-Static block
*

 */
public class Test {

        static{
            System.out.println("Static Block");
        }

        static{
            System.out.println("BBSR");
        }
        static{
            System.out.println("Utkal University");
        }

        {
            System.out.println("MCA Department");
        }

        {
            System.out.println("2019-2022 Batch");
        }

        public static void main(String[] args) {
            System.out.println("Main Method");
            Test t=new Test();

        }












}
