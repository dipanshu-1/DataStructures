package ArrayList.com;

import java.util.ArrayList;
import java.util.Scanner;

public class RotateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n= sc.nextInt();

        for(int i=0;i<n;i++)
            array.add(sc.nextInt());

        System.out.println("Enter the k ");
        int k= sc.nextInt();
//1,2,3,4,5,6,7,8,9,0
//5,6,7,8,9,0,1,2,3,4,

        for (int i=0;i<k;i++){
            int temp=array.get(k+i);
            int temp1= array.get(i);
            array.set(i,temp);
            array.set(k+i,temp1);

        }

        System.out.println(array);
    }
}
