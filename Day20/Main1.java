import java.util.*;

public class Main1 {
    public static void main(String[] args){
        /*
         Data Structures 

         LinkedList

         major disadvantages of Array
         (i) Size is fixed
         DMA - Dynamic Memory Allocation
         (ii) It can access only homogeneous elements
         UDD - User Defined Datatype 
        */

         /*
         Node nn = new Node();
         System.out.println(nn.data); //ClassName@memoryHash & 0
         System.out.println(nn.next); //null
          */


        LinkedList ll = new LinkedList();
        ll.insertAtBeg(5);
        ll.insertAtBeg(25);
        ll.insertAtBeg(50);

        ll.insertAtEnd(100);
        ll.insertAtEnd(200);

         ll.display(); 
    }

    // Changed to static so it can be used in static main
    // Changed name to Node (capitalized) to match usage
    static class Node {
        int data;
        Node next;
    }

    static class LinkedList { 
        Node head = null;
        void insertAtBeg(int x){ //insertion at the beginning 
            // Creation of Node
            Node nn = new Node();

            //Definition of Node
            nn.data = x; // store value
            nn.next = head; // connect new node to old head

            // conection of Node
            head = nn; //move head
        }

        // Insertion at the end
        void insertAtEnd(int x){
            //creation of new node
            Node nn = new Node();

            // definition and Store of Node
            nn.data = x;
            nn.next = null;

            // Condition for if List is empty 
            if(head == null){
                head = nn;
                return ;
            }
            else{
                Node temp = head;

                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = nn;
            }

            /*traverse to last node
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
                 */ 

            // temp.next = nn;
        }

    void deleteAtBeg() {
        if(head == null)
            return;
        else if(head.next == null) {
            Node temp = head;
            head = null;
            temp = null;
        }
        else {
            Node temp = head;
            head = head.next;
            temp = null;
        }
	}
	
	void deleteAtEnd() {
        if(head == null)
            return;
        else if(head.next == null) {
            Node temp = head;
            head = null;
            temp = null;
        }
        else {
            Node temp = head;
            
            while(temp.next.next != null)
                temp = temp.next;
                
            temp.next = null;
        }
	}

        
        // to print the linkedlist 

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}
