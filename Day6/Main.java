public class Main {
    public static void main(String[] args) {
        /* 
        Pattern printing 
        Using only 1 loop
        N = 5;
        9
        99
        999
        9999
        99999
    
        int n = 5;
        long num = 0;
        for (int i = 1; i <= n; i++) {
            num = num * 10 + 9;
            System.out.println(num);
        }
        */
       
        /*
        Time complexity 

            i=5; -> o(1)

            i = a+b -> o(2)
            
            i = (a+b)+c -> O(3) system only acess 1 operation at a time and  it will from 'b + c' because it read from right to left because compliar read from that direction only until unless there is barket is mentioned.

            * All of these are constant time complexity. [ o(1) or o(6 or constant)]

            * (6) Measurements of Time complexity 

            1. Consectuive - o(1) - Maximum TC of the statement would be considered.
                    x = 10   ==> Constant time C0

                    k = k + 2   ==> Constant time C1

                    x = a+b  ==> Constant time C2

                    total = C0 + C1 + C2
                    max(C0, C1, C2) = O(C2)

                Why ? 

            2. Conditional - o(1)
            THe test + then part of else part (whichever is larger)
                k =1;  ===> Constant time C0

                if(k % 2 == 0){  ==> 2
                    k = k +1;    ==> 2 |-> Constant time C1 = 2 + 2 (4)
                }else{
                    k++;         ==> 1 |-> Constant time C2 = 1
                }

                total = C0 + C1 + C2
                max(C0, C1, C2) = O(C1) , (2+2 = 4)
                SO total time complexity is O(C1) , consecutive time complexity.
                The maximum time complexity of the statement would be considered.

                Why ? 
                
            3. Sub Routine - o(1)
            RULE : 
            1. when we are analysing TC is a constant value is associcated with with arithmematic in an expression we can cut off the constant value.

            2. Any known value can be considered as constant.

            3. Add, SUb, multiplication , division are basic arithematics.

        EX1   for(i =1, i<=10, i++){        ---> Executes 10 times
                print("*")                ---> Constant time t
            }
                total = 10 x C  ==> c10 ==> O(C)

        EX2   for(i =1, i<=n, i++){        ---> Executes n times
                print("*")                ---> Constant time t
            }
                total = n x C  ==> cn ==> O(n)
                
            4. Nested sub routine - o(1)
                for(i =1, i<=n, i++){            ---> Executes n times
                    for(j =1, j<=n, j++){        ---> Executes n times
                        print("*")               ---> Constant time t
                    }
                }
                total = n x n x C  ==> cn^2 ==> O(n^2)
                n power increase by the number of nested loops.

            5. log - o(log n)
              IF an algorithm constantly reduce the problem size by a fraction (Usually the fraction will be 2).

              if n = 512
              for(i =1, i<=n,)
                i = i * 2;

              the above algorith makes 1 value doubling every time.
              At some point 2^i = n;
              To simplify the statement, let's take log on both sides.
              log(2^i) = log(n)
              i log(2) = log(n)

              if we cut off the constant value of log2 from LHS to RHS , we get

              i = log(n)/log(2)
              i = log(n)/1
              i = log(n)    ===> O(log n) base will be assumed as 2.
              
            6. Square root - o(sqrt n)
                The executution take o^1/2 evaluations
                
                for(i =1; i<=sqrt(n); i++)

                for(i =1; i*i <= n; i++)

                sqrt of n = o^1/2
            
        */

            // https://onlinegdb.com/geovTsq6p8
            /*
            import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	}
}


1. Consecutive
    Maximum time complexities of the statements would be considered.
    
    x = 10          ====> Constant time c0
    
    k = k + 2       ====> Constant time c1
    
    x = a + b       ====> Constant time c2
    
    Total = c0 + c1 + c2
    max(c0, c1, c2)     ==> O(c)

2. Conditional
    The test + then part or else part (whichever is larger)
    
    k = 1               ====> Constant time c0
    
    if(k % 2 == 0)
        k = k + 1       ====> Constant Time c1
    else
        k++             ====> Constant Time c2
        
    Total = c0 + c1 + c2
    max(c0, c1, c2) ==> O(c)

3. Sub Routine

    for(i=1; i<=10; i++)    ---> Executes 10 times
        print("*")          ---> Constant Time c 
        
    Total = 10 x c ==> c10 ==> O(c)
    
    
    for(i=1; i<=n; i++)    ---> Executes n times
        print("*")          ---> Constant Time c 
        
    Total = n x c ==> cn ==> O(n)

4. Nested Sub Routine

    for(i=1; i<=n; i++)         ---> Executes n times
        for(j=1; j<=n; j++)     ---> Executes n times 
            print("*")          ---> Constant Time c
            
    Total = c x n x n     ==> cn^2 ==> O(n^2)  

5. Log 
    If an algorithm constantly reduce the problem size by a fraction (Usually 2)

    for(i=1; i<=n;)
        i *= 2
        
    The above algorithm makes i value doubling every time.
    
    At some point 2^i = n 
    To simplify the statement, let's take log on both sides 
    
    log(2^i) = log n 
    i log 2 = log n 
    
    if we cut off the constant value of log 2,
    i = log n       ===> O(log n) (base will be assumed as 2)

6. Square Root 
    The execution take n^1/2 evaluations

    for(i=1; i<=sqrt(n); i++)
    
    for(i=1; i*i<=n; i++)
























































































             */
    }
}