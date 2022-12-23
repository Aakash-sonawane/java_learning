package vanit_contest;
import java.util.*;
import java.io.*;
public class minSwap {
    static boolean minSwaps(int arr[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(arr[i])){
                return false;
            }
            map.put(arr[i], i);
        }
        Arrays.sort(arr);

        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        int ans = 0;
        for (int i = 0; i < n; i++) {

            if (visited[i] || map.get(arr[i]) == i) {
                continue;
            }
            int j = i, res = 0;
            while (!visited[j]) {
                visited[j] = true;


                j = map.get(arr[j]);
                res++;
            }


            if (res > 0) {
                ans += (res - 1);
            }
        }
        if(ans<=1){
            return true;
        }

        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0; i<n ;i++){
            arr[i]=sc.nextInt();
        }

        if(minSwaps(arr, n)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
