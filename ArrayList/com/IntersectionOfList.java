package ArrayList.com;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        ArrayList<Integer> intersection=new ArrayList<>();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of First Array");
        int n=sc.nextInt();
        System.out.println("Now start entering the elements for array 1");
        for (int i=0;i<n;i++)
            arr1.add(sc.nextInt());

        System.out.println("Enter the size of Second Array");
        n=sc.nextInt();
        System.out.println("Now start entering the elements for array 2");
        for (int i=0;i<n;i++)
        {
            int element = sc.nextInt();
            if(arr1.contains(element))
                intersection.add(element);
            arr2.add(element);
        }

        System.out.println(intersection);



    }
}
