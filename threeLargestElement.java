import java.util.Scanner;

public class threeLargestElement {
    static void threeLargestElement(int arr[], int n){
        int first=0;
        int second=0;
        int third=0;

        for(int i=0; i<n; i++){
            if(arr[i]>first){
                third=second;
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second){
                third=second;
                second=arr[i];
            }
            else{
                third=arr[i];
            }
        }

        System.out.println(first+" "+second+" "+third);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        threeLargestElement(arr, n);
    }
}
