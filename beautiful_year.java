/*

<QUESTION> 271A - 11 :                              BEAUTIFUL YEAR

time limit per test : 2 seconds
memory limit per test : 256 megabytes

It seems like the year of 2013 came only yesterday. Do you know a curious fact? The year of 2013 is the first year after the old 1987 with only distinct digits.

Now you are suggested to solve the following problem: given a year number, find the minimum year number which is strictly larger than the given one and has only distinct digits.

Input
The single line contains integer y (1000 ≤ y ≤ 9000) — the year number.

Output
Print a single integer — the minimum year number that is strictly larger than y and all it's digits are distinct. It is guaranteed that the answer exists.

*/

import java.util.HashSet;
import java.util.Scanner;

public class beautiful_year {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String n = (in.nextLine());// we input as a string because it will be easier and shorter to calculate the
                                   // number's length
        int l = n.length();// we find the length
        int y = Integer.parseInt(n);// parsing it to int
        boolean b = false;
        while (b == false) {
            // we increament y until the ripe year is obtained
            ++y;
            b = chaeck(y, l);
        }
        System.out.println(y);
    }

    public static boolean chaeck(int y, int l) {
        HashSet<Integer> h = new HashSet<>();
        // a hash set can only contain different elements
        for (int i = 0; i < l; i++) {
            // seperating the elements and adding them into the hash set
            h.add(y % 10);
            y /= 10;
        }
        boolean b = false;
        if (h.size() == l) {
            // check if the hash set and the original length are the same
            // only then they show that the numbers are not repeated
            b = true;
        }
        return b;
    }
    /*
     * PROGRAM WORKS WELL
     * 
     * Time : 374 ms
     * Memory : 0 KB
     * Tests : 27
     * https://codeforces.com/contest/271/submission/159517119
     * 
     */
}
