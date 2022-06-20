/*
 
<QUESTION> 344A - 12 :                          MAGNETS

time limit per test : 1 second
memory limit per test : 256 megabytes

Mad scientist Mike entertains himself by arranging rows of dominoes. He doesn't need dominoes, though: he uses rectangular magnets instead. Each magnet has two poles, positive (a "plus") and negative (a "minus"). If two magnets are put together at a close distance, then the like poles will repel each other and the opposite poles will attract each other.

Mike starts by laying one magnet horizontally on the table. During each following step Mike adds one more magnet horizontally to the right end of the row. Depending on how Mike puts the magnet on the table, it is either attracted to the previous one (forming a group of multiple magnets linked together) or repelled by it (then Mike lays this magnet at some distance to the right from the previous one). We assume that a sole magnet not linked to others forms a group of its own.


Mike arranged multiple magnets in a row. Determine the number of groups that the magnets formed.

Input
The first line of the input contains an integer n (1 ≤ n ≤ 100000) — the number of magnets. Then n lines follow. The i-th line (1 ≤ i ≤ n) contains either characters "01", if Mike put the i-th magnet in the "plus-minus" position, or characters "10", if Mike put the magnet in the "minus-plus" position.

Output
On the single line of the output print the number of groups of magnets.

*/

import java.util.Scanner;

public class magnets {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(in.nextLine());
        int sum = 1;
        // sum holds the total number of magnet pairs
        int o = Integer.parseInt(in.nextLine());
        // we parse every input into int and then check it
        while (n > 1) {
            int y = Integer.parseInt(in.nextLine());
            if (y != o) {
                // every time a magnet of different kind is obtained we increament sum
                // we also change o the comparision integer into the current value
                sum++;
                o = y;
            }
            n--;
        }
        // then print the output
        System.out.println(sum);
    }
    /*
     * PROGRAM WORKS WELL
     * 
     * Time : 748 ms
     * Memory : 0 KB
     * Tests : 31
     * https://codeforces.com/contest/344/submission/161313490
     * 
     */
}
