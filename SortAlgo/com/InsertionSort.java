package SortAlgo.com;

import java.util.Scanner;

public class InsertionSort {
    public static void sort(int[] arr,int n){

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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

        sort(arr,n);
        System.out.println("Sorted Array");
        for (int i:arr)
        System.out.print(i+" ");

    }
}
