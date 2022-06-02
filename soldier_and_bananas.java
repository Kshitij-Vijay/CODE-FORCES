/*

<QUESTION> 546A - 23 :                      SOLDIER AND BANANAS

time limit per test : 1 second
memory limit per test : 256 megabytes
 
A soldier wants to buy w bananas in the shop. He has to pay k dollars for the first banana, 2k dollars for the second one and so on (in other words, he has to pay i·k dollars for the i-th banana).

He has n dollars. How many dollars does he have to borrow from his friend soldier to buy w bananas?

Input
The first line contains three positive integers k, n, w (1  ≤  k, w  ≤  1000, 0 ≤ n ≤ 109), the cost of the first banana, initial number of dollars the soldier has and number of bananas he wants.

Output
Output one integer — the amount of dollars that the soldier must borrow from his friend. If he doesn't have to borrow money, output 0.

*/

import java.util.Scanner;

public class soldier_and_bananas {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int k = Integer.parseInt(in.next()); // cost of the first banana
        int i = Integer.parseInt(in.next()); // initail money
        int w = Integer.parseInt(in.next()); // wanted bananas
        int sum = sum(k, w);// to get the total cost 
        // checking if we have enough so that borrow money = 0
        if (sum > i) {
            System.out.println(sum - i);
        } else {
            System.out.println(0);
        }
    }

    public static int sum(int k, int w) {
        // method to calculate the total amount
        int sum = 0;
        for (int j = 1; j <= w; j++) {
            sum = sum + (k * j);
            // according to the given formula
        }
        return sum;
    }

    /*
     * Program works well
     * 
     * Time : 187 ms
     * Memory : 0 KB
     * Tests : 15
     * https://codeforces.com/contest/546/submission/159272333
     * 
     */
}
