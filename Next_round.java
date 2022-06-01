/*

<QUESTION> 158A - 12 :              NEXT ROUND

time limit per test : 3 seconds
memory limit per test : 256 megabytes

"Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..." — an excerpt from contest rules.

A total of n participants took part in the contest (n ≥ k), and you already know their scores. Calculate how many participants will advance to the next round.

Input
The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50) separated by a single space.

The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤ 100), where ai is the score earned by the participant who got the i-th place. The given sequence is non-increasing (that is, for all i from 1 to n - 1 the following condition is fulfilled: ai ≥ ai + 1).

Output
Output the number of participants who advance to the next round.

*/
import java.util.Scanner;

public class Next_round {
    static Scanner in = new Scanner(System.in);

    // Scanner object for Scanner input
    public static void main(String[] args) {
        int n = Integer.parseInt(in.next());// will contain the total number of objects
        int k = Integer.parseInt(in.next());// the postion of the passing index
        int arr[] = new int[n];// array to store all the elements
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(in.next());
            // inputing each value as each value is single spaced
        }
        int y = arr[k - 1];// array index start from 0... so always [index-1]
        int count = 0;// holds the total number of objects that can pass
        for (int i = 0; i < n; i++) {
            // array to check
            if (arr[i] >= y && arr[i] > 0) {
                count++;
            }
        }
        // printing
        System.out.println(count);
    }
    /*
     * program works and functions well
     * 
     * Time : 404 ms
     * Memory : 0 KB
     * Tests : 50
     * https://codeforces.com/contest/158/submission/159054452
     *
     */
}
