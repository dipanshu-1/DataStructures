package ArrayList.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class RemoveDuplicatesElements {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of Array");
            int n= sc.nextInt();

            ArrayList<Integer> arr =new ArrayList<>();

            System.out.println("Start Entering the Element");
            for (int i=0;i<n;i++)
                arr.add(sc.nextInt());

            Collections.sort(arr);

            for(int i=1;i<arr.size();i++){
                if(Objects.equals(arr.get(i), arr.get(i - 1)))
                {
                    arr.remove(i);
                    i--;
                }
            }
            System.out.println(arr);


        }
    }

