package vanit_contest;

import java.util.Scanner;

public class matrixInAntiClockWise {

    static void matrixInAnticlockwise(int m, int n, int arr[][])
    {
        int i, k = 0, l = 0;

        int cnt = 0;

        int total = m * n;

        while (k < m && l < n) {
            if (cnt == total)
                break;

            for (i = k; i < m; ++i) {
                System.out.print(arr[i][l] + " ");
                cnt++;
            }
            l++;

            if (cnt == total)
                break;

            for (i = l; i < n; ++i) {
                System.out.print(arr[m - 1][i] + " ");
                cnt++;
            }
            m--;

            if (cnt == total)
                break;

            if (k < m) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(arr[i][n - 1] + " ");
                    cnt++;
                }
                n--;
            }

            if (cnt == total)
                break;

            if (l < n)
            {
                for (i = n - 1; i >= l; --i){
                    System.out.print(arr[k][i] + " ");
                    cnt++;
                }
                k++;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int arr[][] = new int[m][n];

            for(int i=0;i<m;i++) {
                for(int j=0;j<n;j++) {
                    arr[i][j]=sc.nextInt();
                }
            }
        matrixInAnticlockwise(m, n,arr);
    }
}

