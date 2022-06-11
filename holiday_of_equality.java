/*

<QUESTION> 758A - 21 :                      HOLIDAY OF EQUALITY

time limit per test : 1 second
memory limit per test : 256 megabytes

In Berland it is the holiday of equality. In honor of the holiday the king decided to equalize the welfare of all citizens in Berland by the expense of the state treasury.

Totally in Berland there are n citizens, the welfare of each of them is estimated as the integer in ai burles (burle is the currency in Berland).

You are the royal treasurer, which needs to count the minimum charges of the kingdom on the king's present. The king can only give money, he hasn't a power to take away them.

Input
The first line contains the integer n (1 ≤ n ≤ 100) — the number of citizens in the kingdom.

The second line contains n integers a1, a2, ..., an, where ai (0 ≤ ai ≤ 106) — the welfare of the i-th citizen.

Output
In the only line print the integer S — the minimum number of burles which are had to spend.

*/

import java.util.Scanner;

public class holiday_of_equality {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int l = Integer.parseInt(in.nextLine());
        int arr[] = new int[l];
        int max = 0;
        for (int i = 0; i < l; i++) {
            arr[i] = Integer.parseInt(in.next());
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < l; i++) {
            sum = sum + (max - arr[i]);
        }
        System.out.println(sum);
    }
    /*
     * PROGRAM WORKS WELL
     * 
     * Time : 218 ms
     * Memory : 0 KB
     * Tests : 41
     * https://codeforces.com/contest/758/submission/160206672
     * 
     */
}
