/*

<QUESTIONS> 50A - 14 :              DOMINO PILLING

time limit per test : 2 seconds
memory limit per test : 256 megabytes

You are given a rectangular board of M × N squares. Also you are given an unlimited number of standard domino pieces of 2 × 1 squares. You are allowed to rotate the pieces. You are asked to place as many dominoes as possible on the board so as to meet the following conditions:

1. Each domino completely covers two squares.

2. No two dominoes overlap.

3. Each domino lies entirely inside the board. It is allowed to touch the edges of the board.

Find the maximum number of dominoes, which can be placed under these restrictions.

Input
In a single line you are given two integers M and N — board sizes in squares (1 ≤ M ≤ N ≤ 16).

Output
Output one number — the maximal number of dominoes, which can be placed.

*/

import java.util.Scanner;

public class domino_pilling {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int m = Integer.parseInt(in.next());
        int n = Integer.parseInt(in.next());
        // m*n gives the area
        // we can fit total area / area of one domino in the square...and mod gives us
        // unused space where we cannot fit any 2*1 dominos
        int d = (m * n) / 2;
        System.out.println(d);
    }
    /*
     * program works well
     * 
     * Time : 404 ms
     * Memory : 0 KB
     * 
     */
}
