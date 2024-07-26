package BinarySearch.com;

import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,7,7,7,7,7,8,9,10,10,10,10,11,12,13};
        Scanner sc=new Scanner(System.in);
        int target= sc.nextInt();

        int n= arr.length;
        int l=0,h=n-1;
        int start=0,last=n;
        while(l<h){
            int mid=(l+h)/2;
            if(arr[mid]<target)
                l=mid+1;
            else
                h=mid-1;

        }
        start=l;

        l=0;
        h=n-1;
        while (l<h)
        {
            int mid=(l+h)/2;
            if(arr[mid]<=target)
                l=mid+1;
            else
                h=mid-1;

        }
        last=l;

        System.out.println("Start: "+start+" last:"+last);
    }
}
