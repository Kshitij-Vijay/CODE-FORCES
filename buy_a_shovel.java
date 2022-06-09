/*

<QUESTION> 732A - 43 :                  BUY A SHOVEL 

time limit per test : 1 second
memory limit per test : 256 megabytes

Polycarp urgently needs a shovel! He comes to the shop and chooses an appropriate one. The shovel that Policarp chooses is sold for k burles. Assume that there is an unlimited number of such shovels in the shop.

In his pocket Polycarp has an unlimited number of "10-burle coins" and exactly one coin of r burles (1 ≤ r ≤ 9).

What is the minimum number of shovels Polycarp has to buy so that he can pay for the purchase without any change? It is obvious that he can pay for 10 shovels without any change (by paying the requied amount of 10-burle coins and not using the coin of r burles). But perhaps he can buy fewer shovels and pay without any change. Note that Polycarp should buy at least one shovel.

Input
The single line of input contains two integers k and r (1 ≤ k ≤ 1000, 1 ≤ r ≤ 9) — the price of one shovel and the denomination of the coin in Polycarp's pocket that is different from "10-burle coins".

Remember that he has an unlimited number of coins in the denomination of 10, that is, Polycarp has enough money to buy any number of shovels.

Output
Print the required minimum number of shovels Polycarp has to buy so that he can pay for them without any change.

*/

import java.util.Scanner;

public class buy_a_shovel {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(in.next());// cost of one shovel
        int c = Integer.parseInt(in.next());// change
        int i = 1;
        // the max cost can go to ten
        // so uptil then we search if there is any number satisfying the value
        for (; i < 10; i++) {
            int y = (n * i) % 10;
            if (y == c || y == 0) {
                break;
            }
        }
        System.out.println(i);
    }
    /*
     * PROGRAM WORKS WELL
     * 
     * Time : 187 ms
     * Memory : 0 KB
     * Tests : 54
     * https://codeforces.com/contest/732/submission/160033747
     *
     */
}
