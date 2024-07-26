package BinarySearch.com;

import java.util.Scanner;

public class RotatedArray {
    public static int rotatedArray(int[] arr,int target){
        int n=arr.length;
        int l=0,h=n-1;
        int pivot=h;

        while(l<h){
            int mid=(l+h)/2;
            if(arr[mid]>arr[h])
                l=mid+1;
            else
                h=mid;
        }
        pivot = l;

        l=0;
        h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            int rmind=(mid+pivot)%n;

            if(arr[rmind]==target)
                return rmind;
            if(arr[rmind]>target)
                h=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,11,12,13,1,2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        int target= sc.nextInt();

        int result=rotatedArray(arr,target);
        if(result!=-1)
            System.out.println("Target is at found at index: "+result);
        else
            System.out.println("Not Found!");
    }
}
