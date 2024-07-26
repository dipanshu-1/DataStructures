package LinearSearch.com;

import java.util.Scanner;

public class FirstOccurrence {
    public static int firstOccurrence(int[] arr,int target){
        int n= arr.length;
        for (int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9765,43345,4,32,32,};
        Scanner sc=new Scanner(System.in);
        int target = sc.nextInt();
        int result1=firstOccurrence(arr,target);
        if(result1!=-1)
            System.out.println("Target is at First found at index: "+result1);
        else
            System.out.println("Not Found!");
    }
}
