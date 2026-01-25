public class Stacklist {

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();

        s.push(60);   // No overflow in linked list

        s.pop();
        s.pop();
        s.pop();
        s.display();

        s.peek();
        s.stackSize();

        if (s.isFull() == 1)
            System.out.println("Stack is FULL\n");
        else
            System.out.println("Stack is NOT FULL\n");

        if (s.isEmpty() == 1)
            System.out.println("Stack is EMPTY\n");
        else
            System.out.println("Stack is NOT EMPTY\n");
    }

    // Stack using Linked List
    static class Stack {

        // Node structure
        static class Node {
            int data;
            Node next;
        }

        Node top = null;
        int count = 0;

        // PUSH operation
        void push(int x) {
            Node nn = new Node();
            nn.data = x;
            nn.next = top;
            top = nn;
            count++;
        }

        // POP operation
        void pop() {
            if (top == null)
                System.out.println("Stack Underflow\n");
            else {
                top = top.next;
                count--;
            }
        }

        // PEEK operation
        void peek() {
            if (top == null)
                System.out.println("Stack is EMPTY\n");
            else
                System.out.println("Top element : " + top.data + "\n");
        }

        // Stack is never full in linked list
        int isFull() {
            return 0;
        }

        // Check empty
        int isEmpty() {
            return (top == null) ? 1 : 0;
        }

        // Stack size
        void stackSize() {
            System.out.println("Stack Count : " + count + "\n");
        }

        // Display stack
        void display() {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("\n");
        }
    }
}
