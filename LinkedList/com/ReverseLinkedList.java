package LinkedList.com;

import java.util.*;
import static LinkedList.com.LinkedList.*;

public class ReverseLinkedList {
    public static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Linked List");
        int n= sc.nextInt();

        System.out.println("Enter the element that you want to add in the linked list");

        for(int i=0;i<n;i++)
            list=insert(list, sc.nextInt());


        System.out.println("Linked List is: ");
        printList(list.head);

        Node newHead=reverse(list.head);
        System.out.println("reversed Linked List is");
        printList(newHead);

    }
}
