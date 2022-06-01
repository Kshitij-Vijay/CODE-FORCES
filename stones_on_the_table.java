/*

<QUESTION> 266A - 8 :               STONES ON THE TABLE

time limit per test : 2 seconds
memory limit per test : 256 megabytes
 
There are n stones on the table in a row, each of them can be red, green or blue. Count the minimum number of stones to take from the table so that any two neighboring stones had different colors. Stones in a row are considered neighboring if there are no other stones between them.

Input
The first line contains integer n (1 ≤ n ≤ 50) — the number of stones on the table.

The next line contains string s, which represents the colors of the stones. We'll consider the stones in the row numbered from 1 to n from left to right. Then the i-th character s equals "R", if the i-th stone is red, "G", if it's green and "B", if it's blue.

Output
Print a single integer — the answer to the problem.

*/

import java.util.Scanner;

public class stones_on_the_table {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int q = Integer.parseInt(in.nextLine());
        // string builder is easy to operate 
        // so converting our string to string builder and parsing
        StringBuilder s = new StringBuilder(in.nextLine());

        // run returns an int that is our answer
        System.out.println(run(s));
    }

    public static int run(StringBuilder s) {
        int sum = 0;
        // sum counts the total number of stones that satisfy
        int i = 1;
        // i is the index for us to search

        // while loop runs from 1 to length-1
        // we begin from 1 to avoid out of bounds error 
        // even if the input is only 1 character answer is 0
        while (i <= s.length() - 1) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                // compare if the two adjacent chars are the same then increament sum
                sum++;
                s.delete(i - 1, i);
                // remove the repeated chars
                // thus, shortening our string and saving the index values
            } else {
                // if 2 adjacent chars are not the same 
                // we go on to the next index
                i++;
            }
        }
        return sum;
    }
    /*
    program functions well

    Time : 404 ms
    Memory : 0 KB
    Tests : 34
    https://codeforces.com/contest/266/submission/159140693

    */
}
