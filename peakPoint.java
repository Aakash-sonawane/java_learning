import java.util.Scanner;

public class peakPoint{
    static int findPeakPoint(int arr[], int n){
        for (int i=1; i<n-1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];

        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int index=findPeakPoint(arr, n);
        System.out.println(index);
    }
}
//Input: array[] = {10, 20, 15, 2, 23, 90, 67}
//        Output: 20 or 90