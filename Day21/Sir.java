
package Day21;

/*import java.util.Scanner;
public class Sir
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList l1 = new LinkedList();
		int var;
		// Input - 10 20 30 -1

		do {
			var = sc.nextInt();
			l1.insertAtEnd(var);
		} while(var != -1);

		//l1.display();
		l1.displayRecursive(l1.head);
		
		l1.deleteAtBeg();
		l1.display();
		
		l1.deleteAtEnd();
		l1.display();
	}
}

class Node {
	int data;
	Node next;
}

class LinkedList {
	Node head = null;

	void insertAtBeg(int x) {
		// Creation of Node
		Node nn = new Node();

		// Definition of Node
		nn.data = x;
		nn.next = head;

		// Connection of Node
		head = nn;
	}

	void insertAtEnd(int x) {
		// Creation of Node
		Node nn = new Node();

		// Definition of Node
		nn.data = x;
		nn.next = null;

		// Connection of Node
		if(head == null)
			head = nn;
		else {
			Node temp = head;

			while(temp.next != null)
				temp = temp.next;

			temp.next = nn;
		}
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

	// Insert at Any Position
	void insertAtPos(int x, int pos) {

    // Case 1: insert at beginning
    if (pos == 1) {
        insertAtBeg(x);
        return;
    }

    Node nn = new Node();
    nn.data = x;

    Node temp = head;

    // Move to (pos - 1)th node
    for (int i = 1; i < pos - 1; i++) {
        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }
        temp = temp.next;
    }

    // Insert node
    nn.next = temp.next;
    temp.next = nn;
}

// Deletion at any point 

void deleteAtPos(int pos) {

    // Case 1: empty list
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    // Case 2: delete first node
    if (pos == 1) {
        head = head.next;
        return;
    }

    Node temp = head;

    // Move to (pos - 1)th node
    for (int i = 1; i < pos - 1; i++) {
        if (temp.next == null) {
            System.out.println("Position out of range");
            return;
        }
        temp = temp.next;
    }

    // If position invalid
    if (temp.next == null) {
        System.out.println("Position out of range");
        return;
    }

    // Skip the node
    temp.next = temp.next.next;
}

// Reverse a linkedlist

void reverse() {

    Node prev = null;
    Node curr = head;
    Node next = null;

    while (curr != null) {
        next = curr.next;   // 1️⃣ save next
        curr.next = prev;   // 2️⃣ reverse link
        prev = curr;        // 3️⃣ move prev
        curr = next;        // 4️⃣ move curr
    }

    head = prev;
}



	void display() {
		Node temp = head;

		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("NULL\n");
	}

	void displayRecursive(Node temp){
		if(temp == null){
			return;
		}
		else{
			displayRecursive(temp.next);
			System.out.println(temp.data + " -> ");
			// displayRecursive(temp.next);
		}
	}
}
    */

import java.util.Scanner;

public class Sir {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();

        int choice, val, pos;

        do {
            System.out.println("\n====== LINKED LIST MENU ======");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete at Beginning");
            System.out.println("5. Delete at End");
            System.out.println("6. Delete at Position");
            System.out.println("7. Reverse Linked List");
            System.out.println("8. Display");
            System.out.println("9. Display Recursive");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    l1.insertAtBeg(val);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    l1.insertAtEnd(val);
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    l1.insertAtPos(val, pos);
                    break;

                case 4:
                    l1.deleteAtBeg();
                    break;

                case 5:
                    l1.deleteAtEnd();
                    break;

                case 6:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    l1.deleteAtPos(pos);
                    break;

                case 7:
                    l1.reverse();
                    System.out.println("Linked List Reversed");
                    break;

                case 8:
                    l1.display();
                    break;

                case 9:
                    l1.displayRecursive(l1.head);
                    System.out.println("NULL");
                    break;

                case 0:
                    System.out.println("Program Exit");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}

// ================= NODE CLASS =================
class Node {
    int data;
    Node next;
}

// =============== LINKED LIST CLASS ===============
class LinkedList {

    Node head = null;

    // Insert at Beginning
    void insertAtBeg(int x) {
        Node nn = new Node();
        nn.data = x;
        nn.next = head;
        head = nn;
    }

    // Insert at End
    void insertAtEnd(int x) {
        Node nn = new Node();
        nn.data = x;
        nn.next = null;

        if (head == null) {
            head = nn;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = nn;
        }
    }

    // Insert at Any Position
    void insertAtPos(int x, int pos) {

        if (pos == 1) {
            insertAtBeg(x);
            return;
        }

        Node nn = new Node();
        nn.data = x;

        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }

        nn.next = temp.next;
        temp.next = nn;
    }

    // Delete at Beginning
    void deleteAtBeg() {
        if (head == null)
            return;
        head = head.next;
    }

    // Delete at End
    void deleteAtEnd() {
        if (head == null)
            return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;

        temp.next = null;
    }

    // Delete at Any Position
    void deleteAtPos(int pos) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (pos == 1) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            if (temp.next == null) {
                System.out.println("Position out of range");
                return;
            }
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Position out of range");
            return;
        }

        temp.next = temp.next.next;
    }

    // Reverse Linked List
    void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Display
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Display Recursive
    void displayRecursive(Node temp) {
        if (temp == null)
            return;

        System.out.print(temp.data + " -> ");
        displayRecursive(temp.next);
    }
}

