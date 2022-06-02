/*

<QUESTION> 617A - 11 :                      ELEPHANT

time limit per test : 1 second
memory limit per test : 256 megabytes

An elephant decided to visit his friend. It turned out that the elephant's house is located at point 0 and his friend's house is located at point x(x > 0) of the coordinate line. In one step the elephant can move 1, 2, 3, 4 or 5 positions forward. Determine, what is the minimum number of steps he need to make in order to get to his friend's house.

Input
The first line of the input contains an integer x (1 ≤ x ≤ 1 000 000) — The coordinate of the friend's house.

Output
Print the minimum number of steps that elephant needs to make to get from point 0 to point x.

*/

import java.util.Scanner;

public class elephant_walks {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(in.nextLine());
        int s = 0;// counts the steps required

        // for 5
        s = s + (t / 5);
        t = t % 5;

        if (t != 0) {
            // for 4
            s = s + (t / 4);
            t = t % 4;
        }

        if (t != 0) {
            // for 3
            s = s + (t / 3);
            t = t % 3;
        }

        if (t != 0) {
            // for 2
            s = s + (t / 2);
            t = t % 2;
        }

        if (t != 0) {
            // for 1
            s = s + (t / 1);
            t = t % 1;
        }
        System.out.println(s);
    }
    /*
     * PROGRAM WORKS WELL
     * 
     * Time : 218 ms
     * Memory : 0 KB
     * Tests : 34
     * https://codeforces.com/contest/617/submission/159275319
     * 
     */
}
