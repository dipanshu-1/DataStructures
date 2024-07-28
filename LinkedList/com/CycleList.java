package LinkedList.com;
import java.util.*;
import static LinkedList.com.LinkedList.*;

public class CycleList {
  public static  boolean detectLoop(Node head)
    {
        Node slowPointer = head,
                fastPointer = head;

        while (slowPointer != null
                && fastPointer != null
                && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer)
                return true;
        }

        return false;
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


    System.out.println("Is this a Cyclic list");
    System.out.println(detectLoop(list.head));
}
}
