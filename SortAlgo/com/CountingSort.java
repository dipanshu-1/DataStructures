package SortAlgo.com;
import java.util.*;

public class CountingSort {
    public static int[] countSort(int[] inputArray) {
        int N = inputArray.length;
        int M = 0;

        for (int j : inputArray) {
            M = Math.max(M, j);
        }

        int[] countArray = new int[M + 1];

        for (int j : inputArray) {
            countArray[j]++;
        }

        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] outputArray = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
            countArray[inputArray[i]]--;
        }

        return outputArray;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();

        arr=countSort(arr);
        System.out.println("Sorted Array");
        for(int i:arr)
            System.out.print(i+" ");

    }
}
