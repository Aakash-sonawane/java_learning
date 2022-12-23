package vanit_contest;

import java.util.Scanner;

public class divideArrayInThreeParts {
    static int FindEqaualSum(int arr[], int n){
        int ans=0;
        int i=0, j=n-1;
        int leftSum=0;
        int rightSum=0;
        while(i<=j){
            leftSum= leftSum+arr[i];
            System.out.println(leftSum +" "+ rightSum);

            if(leftSum == rightSum){
                ans=leftSum;
                i++;
                j--;
            }

            if(leftSum<rightSum){
                i++;
            }
            if(leftSum>rightSum){
                rightSum= rightSum+arr[j];
                j--;
            }




        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];

        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int res= FindEqaualSum(arr, n);
        System.out.println(n);
        System.out.println(res);
    }
}
