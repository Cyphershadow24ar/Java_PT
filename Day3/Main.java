// Control structures - it will decide the excution flow of the program
/*
    TOPIC - CONTROL STRUCTURES
    1. Decision making (DM) -> simple - if, if-else, if-else-if, switch, cascaded if, nested if

    2. loop -> Entry - while, for, || Exit - do-while, Nested loop.

    3. Jump -> break, continue, return, exit.
 */


// NOTE : In c general when We print something like 
/*

int a = printf("Hello");
printf("%d",a);

output - hello
return value - 5

why ? -> printf() function returns the number of characters printed, because in C it read the or counts the number of characters.

*/
/* 
public class Main {
    public static void main(String[] args) {
        int a = 5;
        if(a==5){ // If condition is TRUE then only the code inside the if block will be executed if NOT then the code inside the else block will be executed
           // a+=10;
            System.out.println("why pedri ?");
        }
        else{
            System.out.println("happy for Pedri");
        }        
    }
    
}
*/

/*
public class Main{
    public static void main(String[] args) {
        float a = 0.9f;
        if(a == 0.9){
            System.out.println("Same");
        }
        else{
            System.out.println("Not same");
        }
    }
}
 */

/*
 how to identify in the code online that Which number is float or double and how ?

*/
/* 
public class Main{
    public static void main(String[] args) {
        float a = 0.9f;
        double b = 0.9;
        System.out.println(a);
        System.out.println(b);

        float c = 43.6666f;         
        System.out.printf("%.2f%n", c);
        System.out.printf("%.4f%n", c);
        System.out.printf("%.6f%n", c);
        // 1 bit - whole number , 3 bits - float number
        
    }
}  
*/ 

/*
Topic - STACK, Array, string, linked list, queue, tree, graph, heap, sorting, searching, 

 Try to be ready with 3 types of example in the interview 
 1. application example 
 2. real world example 
 3. problem matic example 

 Remove the fear of rejection and be confident and ready with the study prepare well all the your subject. Don't be afraid of rejection and be ready to face it. 
 Don't be overconfident.

*/


/*

1. NESTED IF ELSE LOOP 

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        // if n is divisible by 2 then print n.
        // if n is divisible by 3 then print n.
        // if n is divisible by both.
        // if n is not divisible by both.
        // USE NESTED IF 
        if(n%2==0){
            System.out.println(n);
            if(n%3==0){
                System.out.println(n);{
                    if(n%2==0 && n%3==0){
                        System.out.println(n);
                    }
                    else{
                        System.out.println("NOT");
                    }
                }
            }
        }
        else{
            System.out.println("NOT");
        }
    }
}

NOTE : REVIEW AND PRATICE ON THIS 
*/

/* 2. Cascaded IF-else

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks You have scored: ")
        int marks = sc.nextInt();
        if(marks == 100)
            System.out.println("O GRADE");
        else if(marks >= 85 && marks <= 99)
            System.out.println("A+ GRADE");
        else if(marks >= 65 && marks <= 84 )
            System.out.println("B+ GRADE");
        else if(marks >= 40 && marks <= 64)
            System.out.println("C+ GRADE");
        else
            System.out.println("Fail.");
    }
}
   
*/

/* 3. Switch Cases
 */

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            //case 1:
            case 'A': // this print when input i ^% because the character ASCII value is 65.
                System.out.println("You have chosen 1");
                break;
            /* case 2.0: 
                Main.java:168: error: incompatible types: possible lossy conversion from double to int
                case 2.0:
                    ^
                1 error
            */
           /*
            case 65: 
                Main.java:168: error: duplicate case label
                case 65:
                    ^
                1 error
             */
            case 2:
                System.out.println("You have chosen 2");
                break;
            case 3:
                System.out.println("You have chosen 3");
                break;
            default:
                System.out.println("Invalid choice");
        }  
        
        sc.close();
    }
}

/*
    import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // --- 1. Float vs Double ---
        System.out.println("--- 1. Float vs Double ---");
        float fVal = 0.9f;
        double dVal = 0.9;
        
        // Correct comparison (casting or epsilon recommended for real apps)
        if (fVal == (float)dVal) {
             System.out.println("vals are equal when strictly compared as floats.");
        } else {
             System.out.println("vals are NOT equal when compared directly (float vs double precision).");
        }
        System.out.println(); // New line
        // --- 2. Cascaded/Nested IF (Divisibility Task) ---
        System.out.print("Enter a number to check divisibility (by 2 and 3): ");
        int n = sc.nextInt();
        // Optimized logic instead of deep nesting
        if (n % 2 == 0 && n % 3 == 0) {
            System.out.println(n + " is divisible by BOTH 2 and 3.");
        } else if (n % 2 == 0) {
            System.out.println(n + " is divisible by 2 only.");
        } else if (n % 3 == 0) {
            System.out.println(n + " is divisible by 3 only.");
        } else {
            System.out.println(n + " is NOT divisible by 2 or 3.");
        }
        System.out.println();
        // --- 3. Cascaded IF (Grades) ---
        // Fixed syntax error (missing semicolon)
        System.out.print("Enter marks for grade: "); 
        int marks = sc.nextInt();
        
        if (marks == 100)
            System.out.println("O GRADE");
        else if (marks >= 85 && marks <= 99)
            System.out.println("A+ GRADE");
        else if (marks >= 65 && marks <= 84)
            System.out.println("B+ GRADE");
        else if (marks >= 40 && marks <= 64)
            System.out.println("C+ GRADE");
        else
            System.out.println("Fail.");
        System.out.println();
        // --- 4. Switch Case ---
        System.out.println("--- Switch Case ---");
        System.out.println("Enter 1, 2, 3, or 'A' (65): ");
        
        // Note: Using 'Next' to read loose inputs easier, or handle appropriately
        // For this demo, let's just assume integer input.
        if (sc.hasNextInt()) {
            int choice = sc.nextInt();
            switch (choice) {
                case 65: // Corresponds to 'A' if interpreted as int, or input 65
                    System.out.println("You chose 65 (which is ASCII 'A')");
                    break;
                // case 'A': // DUPLICATE LABEL ERROR if uncommented with case 65
                // case 2.0: // TYPE MISMATCH ERROR (double not allowed in int switch)
                case 1:
                    System.out.println("You chose 1");
                    break;
                case 2:
                    System.out.println("You chose 2");
                    break;
                case 3:
                    System.out.println("You chose 3");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } else {
             System.out.println("Please enter a valid integer.");
        }
        sc.close();
    }
}
*/
