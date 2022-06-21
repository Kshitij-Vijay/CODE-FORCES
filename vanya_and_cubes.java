/*

<QUESTION> 492A - 8 :                   VASYA AND CUBES

time limit per test : 1 second
memory limit per test : 256 megabytes

Vanya got n cubes. He decided to build a pyramid from them. Vanya wants to build the pyramid as follows: the top level of the pyramid must consist of 1 cube, the second level must consist of 1 + 2 = 3 cubes, the third level must have 1 + 2 + 3 = 6 cubes, and so on. Thus, the i-th level of the pyramid must have 1 + 2 + ... + (i - 1) + i cubes.

Vanya wants to know what is the maximum height of the pyramid that he can make using the given cubes.

Input
The first line contains integer n (1 ≤ n ≤ 104) — the number of cubes given to Vanya.

Output
Print the maximum possible height of the pyramid in the single line.

*/

import java.util.Scanner;

public class vanya_and_cubes {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i > 0; i++) {
            // we see if our sum fits exactly in the given range 
            // then depending upon that we print the output floor
            if (kyuubi(i) <= n && kyuubi(i + 1) > n) {
                System.out.println(i);
                i = -10;
            }
        }
    }

    public static int kyuubi(int f) {
        // f is for floor
        int i = 1;
        int sum = 0;
        while (i <= f) {
            sum = sum + ((i * (i + 1)) / 2);
            //the sum is the sum upto the floor number and added with the remaning 
            // so according to that we calculate sum 
            i++;
        }
        // returning sum
        return sum;
    }
    /*
     * PROGRAM WORKS WELL
     * 
     * Time : 202 ms
     * Memory : 0 KB
     * Tests : 25
     * https://codeforces.com/contest/492/submission/161326749
     */
}
