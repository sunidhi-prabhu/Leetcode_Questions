/*You are given an array of characters letters that is sorted in non-decreasing order,
 and a character target. There are at least two different characters in letters.
Return the smallest character in letters that is lexicographically greater than target.
 If such a character does not exist, return the first character in letters.*/

import java.util.Scanner;

public class SmallestLetter {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a target character");
        char target = in.next().charAt(0);

        target = Character.toLowerCase(target);

        int low = 97 ,high = 122, mid;
        while(low <= high){
            mid = (low+high)/2;


            if((int)target == mid && target < 122){
                System.out.println((char) (mid + 1));
                return;
            }

            else if((int)target == mid && target == 122){
                System.out.println((char) mid);
                return;
            }


            else if (mid < target)
                low = mid +1;


            else
                high = mid -1;

        }
    }
}
