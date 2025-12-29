package Day12;
import java.util.*;
public class Main {
    public static void main(String[] args){
        // Functions and Recursions - Mid term
        // Till Strings - 27/12/2025

        /* Define 

        return_type method_name(parameters){
            body og the mrthod 
        }
        
        eg:  void add(int a, int b){
            int c = a + b;
            sop(c);
        }
         */

        // Parameters are variables declared in a function definition, whereas arguments are the actual values passed to the function during the function call.

        /*
        Call

        method_name(Argumnt(s));

        eg: add(10,15);
        */
       add(5,10);   
       fun();
       funtwo("I am Coconut.");
       int z = fun3(10,100);
       System.err.println(z);
       
    }

    static void add(int a, int b){
        int c = a+b;
        System.err.println(c);
    }

    static void fun(){
        
        System.err.println("Hello ");
    }

    static void funtwo(String msg){
        System.err.println("Hello " + msg);
    }

    static int fun3(int c, int d){
        
        return c+d;
    }

    // we can create same name variable in the same code BUT should be in a different scope of the code or block of code.

    // current year - accenture for 2 marks mid sem 

    // rev = rev * 10 + digit

    // Recursion 

    /*
        int fact(int n){
            if(n == i)
                return i;
            else
                return ns fact(n-i);
        }
        main(){
        fact(5)
        }
    */
   
    /*

    type of reursion ?? 3 types 
    1. tail
    2. indirect 
    3.  
     */
    
}