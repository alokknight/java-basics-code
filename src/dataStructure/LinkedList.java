package dataStructure;

public class LinkedList {
    Node head = null;

    class Node {
        int data;
        Node linknode;

        Node(int data) {
            this.data = data;
            this.linknode = null;
        }
    }

    Node reverse(Node head) {
        Node current = head;
        Node next = null;
        Node prev = null;
        while (current != null) {
            next = current.linknode;
            current.linknode = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    
    Node reverseRecursive(Node head){
    	if(head == null || head.linknode == null){
    		return head;
    	}
    	
    	Node reversedhead = reverseRecursive(head.linknode);
    	head.linknode.linknode = head;
    	head.linknode = null;
    	return reversedhead;
    }

    Node addNodeAtLast(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.linknode != null) {
            temp = temp.linknode;
        }
        temp.linknode = newNode;
        return head;
    }

    Node addNodeAtFirst(Node head, int data) {
        Node newNode = new Node(data);
        newNode.linknode = head;
        head = newNode;
        return head;
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data +" ");
            temp = temp.linknode;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = ll.addNodeAtFirst(ll.head, 3);
        ll.head = ll.addNodeAtFirst(ll.head, 4);
        ll.head = ll.addNodeAtFirst(ll.head, 5);
        ll.head = ll.addNodeAtFirst(ll.head, 6);
        ll.head = ll.addNodeAtFirst(ll.head, 7);
        ll.head = ll.addNodeAtFirst(ll.head, 8);
        ll.head = ll.addNodeAtLast(ll.head, 0);
        ll.head = ll.addNodeAtLast(ll.head, 0);
        ll.head = ll.addNodeAtLast(ll.head, 0);
        ll.head = ll.addNodeAtLast(ll.head, 2);
        ll.head = ll.addNodeAtLast(ll.head, 7);
        ll.head = ll.addNodeAtLast(ll.head, 89);

        ll.printList(ll.head);
        ll.reverseRecursive(ll.head);
        ll.printList(ll.head);
    }
}
