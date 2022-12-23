import java.util.Scanner;

public class reverseArray {

    static int [] reverse(int arr[], int n){
        int i=0;
        int j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        arr=reverse(arr, n);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
