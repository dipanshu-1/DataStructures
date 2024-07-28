package LinkedList.com;
import java.util.*;
import static LinkedList.com.LinkedList.*;

public class DuplicatesRemoval {
    static void removeDuplicate(Node head)
    {
        // Hash to store seen values
        HashSet<Integer> hs = new HashSet<>();

        /* Pick elements one by one */
        Node current = head;
        Node prev = null;
        while (current != null) {
            int curval = current.data;

            // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            }
            else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
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

        removeDuplicate(list.head);
        System.out.println("reversed Linked List is");
        printList(list.head);
    }

}
