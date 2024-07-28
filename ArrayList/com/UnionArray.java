package ArrayList.com;

import java.util.ArrayList;
import java.util.Scanner;

public class UnionArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        ArrayList<Integer> union =new ArrayList<>();

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of First Array");
        int n=sc.nextInt();
        System.out.println("Now start entering the elements for array 1");
        for (int i=0;i<n;i++) {
            int element= sc.nextInt();
            arr1.add(element);
            union.add(element);
        }

        System.out.println("Enter the size of Second Array");
        n=sc.nextInt();
        System.out.println("Now start entering the elements for array 2");
        for (int i=0;i<n;i++)
        {
            int element = sc.nextInt();
            arr2.add(element);
            if(!arr1.contains(element))
                union.add(element);

        }

        System.out.println(union);

    }
}
