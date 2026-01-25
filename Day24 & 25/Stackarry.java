public class Stackarry {
    public static void main(String[] args) {
        Stack s = new Stack();
        
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        
        s.push(60);
        
        s.pop();
        s.pop();
        s.pop();
        s.display();
        
        s.peek();
        s.stackSize();
        
        if(s.isFull() == 1)
            System.out.println("Stack is FULL\n");
        else
            System.out.println("Stack is NOT FULL\n");
            
        if(s.isEmpty() == 1)
            System.out.println("Stack is EMPTY\n");
        else
            System.out.println("Stack is NOT EMPTY\n");
	
    }

    static class Stack {
    int N = 5;
    int[] st = new int[N];
    int top = -1;
    
    void push(int x) {
        if(top == N-1)
            System.out.println("Stack Overflow\n");
        else 
            st[++top] = x;
    }
    
    void pop() {
        if(top == -1)
            System.out.println("Stack Underflow\n");
        else
            top--;
    }
    
    void peek() {
        if(top == -1)
            System.out.println("Stack is EMPTY\n");
        else
            System.out.println("Top element : " + st[top] + "\n");
    }
    
    int isFull() {
        if(top == N-1)
            return 1;
        return 0;
    }
    
    int isEmpty() {
        if(top == -1)
            return 1;
        return 0;
    }
    
    void stackSize() {
        System.out.println("Stack Count : " + (top + 1) + "\n");
    }
    
    void display() {
        for(int i=top; i>=0; i--)
            System.out.print(st[i] + " ");
        
        System.out.println("\n");
    }
}

}
