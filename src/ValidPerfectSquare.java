/*Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer.
In other words, it is the product of some integer with itself.*/

import java.util.Scanner;
public class ValidPerfectSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int n = in.nextInt();

        int low , high , mid, found = 0;
        low = 0;
        high = n;
        while (low <= high){
            mid = (low + high) / 2;
            if((long)mid * mid == n){
                System.out.println("the given number is a perfect square.");
                found = 1;
                return;
            }

            else if(mid * mid < n)
                low = mid +1;


            else
                high = mid -1;
        }

        if(found == 0){

            System.out.println("not a perfect square");
        }


    }
}