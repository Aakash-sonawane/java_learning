import java.util.Scanner;

public class binarySearchRecrusive {
    static int binarySearch(int arr[], int low, int high, int target) {
        if (low <= high) {
            int mid= (low + high)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if (arr[mid]<target) {
                return binarySearch(arr, mid+1, high, target);
            }
            else {
                return binarySearch(arr, low, mid-1, target);
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();

        int res=binarySearch(arr, 0, n-1, target);

        System.out.println(res);
    }
}

