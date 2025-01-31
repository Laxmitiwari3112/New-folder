package Linkedlist;

//add node at first position in singly linked list
public class Addfirst {

    Node head;
    // ------------------------- track size 
    private int size;

    Addfirst() {
        this.size = 0;
    }

    //--------------------------- CREATE-NODE
    class Node {

        String data;//data
        Node next;//pointer

        //  node_constructor
        Node(String data) {
            this.data = data;
            this.next = null;//null for every new node pointer

            size++;

        }
    }

    // --------------------------------ADD-NODE
    //add-first, last
    public void addFirst(String data) {
        // new LL
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        // add at first in LL
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        // new LL
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        // add at last in LL
        // traversing
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // --------------------------print LL
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // --------------------------------DELETE NODE
    // delete-first
    public void deleteFirst() {
        // emplty LL
        if (head == null) {
            System.out.println("This list is empty.");
            return;
        }
        head = head.next;
        size--;
    }

    // delete last
    public void deleteLast() {
        // emplty LL
        if (head == null) {
            System.out.println("This list is empty.");
            return;
        }

        size--;

        // single node
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;//head.next =null -> lastNode = null
        while (lastNode.next != null) {//null.next gives error
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Addfirst list = new Addfirst();
        list.addFirst("a");
        list.addFirst("is");

        // list.printList();
        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        System.out.println(list.getSize());

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

    }
}
