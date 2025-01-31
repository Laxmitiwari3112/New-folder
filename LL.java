
import java.util.LinkedList;

// package Linkedlist;
public class LL {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        // System.out.println(list);

        list.addLast("list");
        list.addFirst("this");

        list.removeFirst();
        // list.removeLast();
        // list.remove(1);

        System.out.println(list);

        // System.out.println(list.size());
        // // traverse
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i) +" -> ");
        // }
        // System.err.println("null");
    }
}
