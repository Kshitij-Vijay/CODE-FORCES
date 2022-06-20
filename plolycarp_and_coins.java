/*

<QUESTION> 1551A - 26 :                         POLYCARP AND COINS

time limit per test : 1 second
memory limit per test : 256 megabytes

Polycarp must pay exactly n burles at the checkout. He has coins of two nominal values: 1 burle and 2 burles. Polycarp likes both kinds of coins equally. So he doesn't want to pay with more coins of one type than with the other.

Thus, Polycarp wants to minimize the difference between the count of coins of 1 burle and 2 burles being used. Help him by determining two non-negative integer values c1 and c2 which are the number of coins of 1 burle and 2 burles, respectively, so that the total value of that number of coins is exactly n (i. e. c1+2⋅c2=n), and the absolute value of the difference between c1 and c2 is as little as possible (i. e. you must minimize |c1−c2|).

Input
The first line contains one integer t (1≤t≤104) — the number of test cases. Then t test cases follow.

Each test case consists of one line. This line contains one integer n (1≤n≤109) — the number of burles to be paid by Polycarp.

Output
For each test case, output a separate line containing two integers c1 and c2 (c1,c2≥0) separated by a space where c1 is the number of coins of 1 burle and c2 is the number of coins of 2 burles. If there are multiple optimal solutions, print any one.

*/

import java.util.Scanner;

public class plolycarp_and_coins {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int q = Integer.parseInt(in.nextLine());
        // main method just parses the value accordingly
        for (; q > 0; q--) {
            ret(Integer.parseInt(in.nextLine()));
        }
    }

    // this method does all the working
    public static void ret(int n) {
        int e = n / 3;
        // 2 + 1 = 3
        // hence we can equalize the number of coins needed
        if (n % 3 == 0) {
            // it means that there is no remainder and the amount is paid
            System.out.println(e + "\n" + e);
        } else if (n % 3 == 1) {
            // it means that there is only one one burle coin extra we need to pay
            System.out.println((e + 1) + "\n" + e);
        } else if (n % 3 == 2) {
            // it means that there are 2 burles extra that we have to pay by only one 2
            // burle coin
            System.out.println(e + "\n" + (e + 1));
        }
    }
    /*
     * PROGRAM WORKS WELL
     * 
     * Time : 327 ms
     * Memory : 0 KB
     * Tests : 6
     * https://codeforces.com/contest/1551/submission/161315228
     * 
     */
}
