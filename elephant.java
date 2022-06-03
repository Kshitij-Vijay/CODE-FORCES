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

public class elephant {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(in.nextLine());// no of steps needed to walk
        int s = 0; // steps to walk
        int i = 5; // the number of steps it c an take at a time
        while (t != 0) {
            // we decreament t
            s = s + t / i;
            // we add the numnber of steps it walks
            t = t % i;
            // decreament to the number of steps it cannot do by i
            --i;
            // i also decreaments
        }

        System.out.println(s);
    }
    /*
     * PROGRAM WORKS WELL
     * 
     * Time : 187 ms
     * Memory : 0 KB
     * Tests : 34
     * https://codeforces.com/contest/617/submission/159344838
     * 
     */
}
