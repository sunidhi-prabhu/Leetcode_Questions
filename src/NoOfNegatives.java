/*Given a m x n matrix grid which is sorted in non-increasing order
 both row-wise and column-wise, return the number of negative numbers in grid.*/

import java.util.Arrays;
import java.util.Scanner;

public class NoOfNegatives {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;

        System.out.println("enter row size");
        int n = in.nextInt();
        System.out.println("enter col size");
        int m = in.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("enter the elements");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++)
                arr[i][j] = in.nextInt();
        }

        System.out.println("the elements are");
                System.out.println(Arrays.deepToString(arr));



        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if(arr[i][j] < 0)
                    count += 1;
            }
        }
        System.out.println("the number of negative elements are " + count);

    }
}
