package Day1;
// not purely objective oriendted because of multiple inhertinace 

/*
public class Main2{
    public static void main(String[] args){

    }
}
*/

// Main public class and main file name shoudl be same and only 1 public class should be there in the file.

// Public - everyone , private - within the class only , protcted - only given access

/*  Static methods - if U have object of class then U can call static methods 

If object:
    objectiName.methodName();
    className.methodName();

If No object:
    className.methodName();
*/

/*
public class Main {
    public static void main(String[] li) {
        // Create a new String array of size 2
        String[] numbers = new String[2]; 
        
        numbers[0] = "35";
        numbers[1] = "45";
        
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        
        // This will still print "3545" because they are Strings
        System.out.println(numbers[0] + numbers[1]); 
        
        // NOTE: Command line argument Review.
    }
}

// File and Class name should be same because of the OS , because when We excute the file the OS will search for the class name in the file. and wil CALL out Main.Main class ! like this 
 */

/* 

Hello World

class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("Hello World");
        System.out.print("\n");
        System.out.printf("%s", "Hello World");
    }
}
 */

// DATA TYPES - types & size
/*
  Numerical -  whole No. - int - 4 bytes
  decimal No. - float - 4 bytes, double - 8 bytes

  character - letter - char - 1 bytes(old) / 2 bytes (current)
  boolean - true or false - boolean
    group of letters - String - no

class Main{
    public static void main(String[] args) {
        // Primitive Data Types
        int a = 10;
        float b = 10.5f;
        double c = 10.5;
        char d = 'z';
        boolean e = true;
        // Non primitive Data Types
        String f = "Hello";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
*/

// No address and id in java only refernce in Java. No stack in java only heap 

/*
class Main{
    public static void main(String[] args) {
        // Object creation 
        Sample s = new Sample();
        System.out.println(s); // Address in java like this internally in the memoery will be there and visible to others
        System.out.println(s.var); // Accessing the variable
    }
}

class Sample{ // Object
    int var = 10;
}
*/

import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // system - is a package and in is a class , .in - object .input string
        int a = sc.nextInt();
        System.out.println(a);
        // address will be  printed in of the local declare variables only no the user input.
        System.out.println(sc);
    }
}

// Binary conversion Review

// Bit structure - 1, 2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536,131072,262144,524288,1048576,2097152,4194304,8388608,16777216,33554432,67108864,134217728,268435456,536870912,1073741824,2147483648

// clue for bit mainipulation - 2^0, 2^1, 2^2, 2^3, 2^4, 2^5, 2^6, 2^7, 2^8, 2^9, 2^10, 2^11, 2^12, 2^13, 2^14, 2^15, 2^16, 2^17, 2^18, 2^19, 2^20, 2^21, 2^22, 2^23, 2^24, 2^25, 2^26, 2^27, 2^28, 2^29, 2^30, 2^31

// 101101 - it's a odd decimal , because last digit is 1
// 101100 - it's a even decimal , because last digit is 0

/*
  Decimal of - 1011011101 

  Binary Digit,Position (2n),Calculation,Value

1,20,1×1, -1
0,21,0×2, -0
1,22,1×4, -4
1,23,1×8, -8
1,24,1×16, -16
0,25,0×32, -0
1,26,1×64, -64
1,27,1×128,-128
0,28,0×256,-0
1,29,1×512,-512

total = 512 + 0 + 128 + 64 + 0 + 16 + 8 + 4 + 0 + 1 = 733

 */