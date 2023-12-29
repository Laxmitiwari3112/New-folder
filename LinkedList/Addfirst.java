package LinkedList;

//add node at first position in singly linked list
public class Addfirst {
    class Node{
         String data;
         Node next;
         Node(String data){
            this.data=data;
            this.next=null;
         }
    }

    private Node head;
   
//add-first, last
    public void addFirst(String data) {
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }

    public void addLast(String data){
         Node newNode=new Node(data);
       // Node head;
        if(head==null){
            head=newNode;
            return;
        }

        //traversing
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
    }

    public static void main(String[] args) {
        Addfirst list=new Addfirst();
        list.addFirst("a");
        list.addFirst("is");
    }

    
}
