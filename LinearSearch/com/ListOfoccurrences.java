package LinearSearch.com;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfoccurrences{
    public static ArrayList<Integer> allOccurrences(int[] arr, int target){
        int n= arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i=0;i<n;i++){
            if(arr[i]==target){
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9765,43345,4,32,32,};
        Scanner sc=new Scanner(System.in);
        int target = sc.nextInt();

        ArrayList<Integer> ans=allOccurrences(arr,target);
        System.out.println("All occurrences of target are "+ ans);

    }
}
