package SortAlgo.com;

import java.util.Scanner;

public class HeapSort {
    static void heapify(int[] arr,int n,int i){
        int largest=i;
        int l=2*i + 1;
        int r=2*i + 2;

        if(l<n&&arr[l]>arr[largest])
            largest=l;

        if(r<n&&arr[r]>arr[largest])
            largest=r;

        if(largest!=i)
        {
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;

            heapify(arr,n,largest);
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();

        for(int i=n/2 ;i>=0;i--)
            heapify(arr,n,i);

        for (int i=n-1;i>0;i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }

        System.out.println("Sorted in Descending using Heap Sort");
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }

}
