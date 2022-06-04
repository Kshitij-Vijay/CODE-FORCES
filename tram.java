/*

<QUESTION> 116A - 12 :                          TRAM

time limit per test : 2 seconds
memory limit per test : 256 megabytes

Linear Kingdom has exactly one tram line. It has n stops, numbered from 1 to n in the order of tram's movement. At the i-th stop ai passengers exit the tram, while bi passengers enter it. The tram is empty before it arrives at the first stop. Also, when the tram arrives at the last stop, all passengers exit so that it becomes empty.

Your task is to calculate the tram's minimum capacity such that the number of people inside the tram at any time never exceeds this capacity. Note that at each stop all exiting passengers exit before any entering passenger enters the tram.

Input
The first line contains a single number n (2 ≤ n ≤ 1000) — the number of the tram's stops.

Then n lines follow, each contains two integers ai and bi (0 ≤ ai, bi ≤ 1000) — the number of passengers that exits the tram at the i-th stop, and the number of passengers that enter the tram at the i-th stop. The stops are given from the first to the last stop in the order of tram's movement.

The number of people who exit at a given stop does not exceed the total number of people in the tram immediately before it arrives at the stop. More formally, . This particularly means that a1 = 0.
At the last stop, all the passengers exit the tram and it becomes empty. More formally, .
No passenger will enter the train at the last stop. That is, bn = 0.
Output
Print a single integer denoting the minimum possible capacity of the tram (0 is allowed).

*/

import java.util.Scanner;

public class tram {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int stops = Integer.parseInt(in.nextLine());
        int a = 0, b = 0, s = 0, max = 0;
        // a is the number of passengers who board
        // b is the number of passengers who get off
        // s is the intger that holds the total number of passengers in a particular
        // time
        // m is the max value of s

        for (int i = 0; i < stops; i++) {
            a = Integer.parseInt(in.next());
            s = (s - a); // total - getting down
            b = Integer.parseInt(in.next());
            s = s + b; // total + boarding
            if (s >= max) {
                // finding the maxium value of max
                max = s;
            }
        }
        System.out.println(max);
    }
    /*
     * PROGRAM WORKS WELL
     * 
     * Time : 436 ms
     * Memory : 0 KB
     * Tests : 71
     * https://codeforces.com/contest/116/submission/159439142
     * 
     */
}
