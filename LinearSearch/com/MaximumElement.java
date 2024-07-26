package LinearSearch.com;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class MaximumElement {
    public static int maxElement(int[] arr){
        int n= arr.length;
        int maxi=MIN_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,9765,43345,4,32,32,};

        int maxi=maxElement(arr);
        System.out.println("Maximum element is: "+maxi);

    }
}
