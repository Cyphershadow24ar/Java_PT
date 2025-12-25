package Day2;

class Main{
    public static void main(String[] args){
        int a=5, b =10;

        // Relational operators
        System.out.println("Relational operators");
        System.out.println(a==b); 
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        // ternary operator
        System.out.println(" ");    
        System.out.println("Ternary operators");
        System.out.println(a>b ? a : b);
        System.out.println(a<b ? a : b);
        System.out.println(a==b ? a : b);
        System.out.println(a!=b ? a : b);
        System.out.println(a>=b ? a : b);
        System.out.println(a<=b ? a : b);

        // Bitwise operators - BIT MANIPULATION IS THE MOST IMPORTANT CONCEPT IN JAVA IN THE INTERVIEW
        System.out.println(" ");
        System.out.println("Bitwise operators");
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(a<<b);
        System.out.println(a>>b);
        System.out.println(a>>>b);

        // Logical operators
        System.out.println(" ");
        System.out.println("Logical operators");
        System.out.println(a>b && a<b);
        System.out.println(a>b || a<b);
        System.out.println(!(a>b));

        // shifting algorithm or operators
        System.out.println(" ");
        System.out.println("Shifting algorithm");

        int c = 0b0110; // This is equal to 6
        int d = 0b0111; // This is equal to 7
        System.out.println(c&d); // AND
        System.out.println(c|d); // OR
        System.out.println(c^d); // XOR
        System.out.println(~c); // 1's complement
        System.out.println(~d); // 1's complement
        System.out.println(c<<d); // LEFT SHIFT
        System.out.println(c>>d); // RIGHT SHIFT
        System.out.println(c>>>d); // UNSIGNED RIGHT SHIFT
        System.out.println(c<<1); // LEFT SHIFT
        System.out.println(c>>1); // RIGHT SHIFT
        System.out.println(c>>>1); // UNSIGNED RIGHT SHIFT


        int e = 5;        
        // To get 40: 5 * 8 = 5 * (2^3)
        // Shift left by 3 positions
        System.out.println("5 * 8 using bitwise:");
        System.out.println(e << 3); // 5 * 2^3 = 5 * 8 = 40

        //1's Complement`
        // ~n = -(n+1)
        // ~5 = -6
        System.out.println("1's Complement of 5: " + (~e));

        /*  Toy question 
        XOR operation 
        5  3  3  6  1  3  2  5  1  5  5
        0101 ==>5
        0011 ==>3
        0110
        0010 ==>2
        0100
        0110 ==> 6
        0010
        0001 ==> 1
        0011
        0011 ==> 3
        0000
        0010 ==> 2
        0010
        0111 ==> 5
        0111 
        0001 ==> 1
        0110
        0101 ==> 5
        0011
        0110 ==> 5
        0101

        // Review the concept of Hash MAP for - 5,3,2,6,1,3,2,5,1,5,5,7,9

        */
    }
}