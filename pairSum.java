import java.io.*;
import java.util.*;
public class pairSum {
    static int pairSum(int arr[], int n){
        if(n==1 || n==0){
            return 0;
        }
        Arrays.sort(arr);
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += arr[i]*i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(pairSum(arr, n));
    }
}





