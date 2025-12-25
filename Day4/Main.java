package Day4;

public class Main {
    public static void main(String[] args) {
        // Keeping previous lesson code
        /*
        switch(1){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println("31 Days");
            break;
        }
        */

        // WHILE LOOP
        int i = 1;
        while(i <= 3){ 
            System.out.println(i + " ");
            i++;
        }

        // FOR LOOP
        for (i =1; i<=3; i++){
            System.out.println(i + " ");
        }

        /* Logic for prime Number - 5 Levels of Optimization */
        System.out.println("\n--- Prime Number Optimization Levels ---");
        int numberToCheck = 997; // Example prime number
        
        // Level 1
        System.out.println("Level 1 (Basic loop 2 to n-1): " + isPrimeLevel1(numberToCheck));

        // Level 2
        System.out.println("Level 2 (Loop to n/2): " + isPrimeLevel2(numberToCheck));

        // Level 3
        System.out.println("Level 3 (Loop to sqrt(n)): " + isPrimeLevel3(numberToCheck));
        
        // Level 4
        System.out.println("Level 4 (Skip Evens): " + isPrimeLevel4(numberToCheck));

        // Level 5
        System.out.println("Level 5 (6k +/- 1): " + isPrimeLevel5(numberToCheck));
    }

    // ---------------------------------------------------------
    // Level 1: Basic approach
    // Iterate from 2 to n-1. 
    // Time Complexity: O(n)
    // ---------------------------------------------------------
    public static boolean isPrimeLevel1(int n) {
        if (n <= 1) return false;
        // Check all numbers from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // ---------------------------------------------------------
    // Level 2: Optimization to n/2
    // A factor cannot be larger than n/2 (except the number itself).
    // Time Complexity: O(n) but half the iterations of Level 1
    // ---------------------------------------------------------
    public static boolean isPrimeLevel2(int n) {
        if (n <= 1) return false;
        // Check only up to n/2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // ---------------------------------------------------------
    // Level 3: Optimization to sqrt(n)
    // If n has a factor, one must be <= sqrt(n).
    // Time Complexity: O(sqrt(n))
    // ---------------------------------------------------------
    public static boolean isPrimeLevel3(int n) {
        if (n <= 1) return false;
        // Check up to square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // ---------------------------------------------------------
    // Level 4: Skip even numbers
    // Even numbers > 2 are not prime. Check 2, then odd numbers only.
    // Time Complexity: O(sqrt(n)/2)
    // ---------------------------------------------------------
    public static boolean isPrimeLevel4(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false; // Eliminates all even numbers
        
        // Start from 3 and skip even numbers (i+=2)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // ---------------------------------------------------------
    // Level 5: 6k +/- 1 Optimization
    // All primes > 3 are of the form 6k-1 or 6k+1.
    // Time Complexity: O(sqrt(n)/6)
    // ---------------------------------------------------------
    public static boolean isPrimeLevel5(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true; // 2 and 3 are prime
        if (n % 2 == 0 || n % 3 == 0) return false; // Exclude multiples of 2 and 3
        
        // Start from 5 and check 6k-1 (i) and 6k+1 (i+2)
        // i increments by 6 at each step (5, 11, 17...)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;

        /*
        pesudo code

        count =0;
        for(int i=1; i<= n; i++) if i= 2 for optimization o(n-1), i <= n/2 times , o(n/2)
            if(n % i == 0)
                count++;
        if(count == 2)


            return true, prime;
        else
            return false, not prime;
        
        */
       
    }

    int n2 = 997;
    public static boolean isPrimeLevel5ii(int n1) {
    if (n1 <= 1)
        return false;
    if (n1 <= 3)
        return true;

    // eliminate multiples of 2 and 3
    if (n1 % 2 == 0 || n1 % 3 == 0)
        return false;

    // check only 6k ± 1
    for (int i = 5; i * i <= n1; i += 6) {
        if (n1 % i == 0 || n1 % (i + 2) == 0)
            return false;
    }
    return true;
    }

    // If we know no. of iteration we use FOR LOOP , if don't then WHILE LOOP.
}
