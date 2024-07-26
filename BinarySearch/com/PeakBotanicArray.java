package BinarySearch.com;

public class PeakBotanicArray {
    public static int peakBotanic(int[] arr) {
        int n = arr.length;
        int l = 0, h = n - 1;

        while (l < h) {
            int mid = (l + h) / 2;
            if (arr[mid] > arr[h])
                l = mid + 1;
            else
                h = mid;
        }
        return l;
    }
    public static void main(String[] args) {
        int[] arr={10,11,12,13,1,2,3,4,5,6,7,8,9};

        int result=peakBotanic(arr);
        System.out.println("Peak of the Botanic Array is: "+result);
        
    }
}
