package BinarySearch.com;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number= sc.nextInt();
        int precision=sc.nextInt();

        int l=1,h=number;
        double ans=number;

        while(l<h){
            int mid=(l+h)/2;

            if(mid*mid<=number){
                ans=mid;
                l=mid+1;
            }
            else
                h=mid-1;
        }

        double inc=0.1;
        for (int i=0;i<precision;i++){
            while(ans*ans<=number)
                ans+=inc;

            ans=ans-inc;
            inc/=10;
        }
        System.out.println("Square root of "+number+" is "+(float)(ans));



    }
}
