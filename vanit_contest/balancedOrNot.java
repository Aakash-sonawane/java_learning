package vanit_contest;

import java.util.Scanner;

public class balancedOrNot {

    static boolean checkBalanced(int arr[][], int m, int n){
        for(int i=0;i<m;i++) {
            int ones=0;
            int zeros=0;
            for(int j=0;j<n;j++) {
                if(i!=0 && j!=0 && i!=m-1 && j!=n-1){
                    System.out.println(arr[i][j]);
                    if(arr[i-1][j]==arr[i+1][j]){
                        zeros++;
                    }
                    else{
                        ones++;
                    }
                    if(arr[i][j+1]==arr[i][j-1]){
                        zeros++;
                    }
                    else{
                        ones++;
                    }
                }

            }
            if(ones==zeros){
                return true;
            }

        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][] = new int[m][n];

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
            }

        }
        if(checkBalanced(arr, m, n)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
