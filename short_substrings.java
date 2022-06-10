/*

<QUESTION> 1367A - 14 :                     SHORT SUBSTRINGS

time limit per test : 2 seconds
memory limit per test : 256 megabytes

Alice guesses the strings that Bob made for her.

At first, Bob came up with the secret string a consisting of lowercase English letters. The string a has a length of 2 or more characters. Then, from string a he builds a new string b and offers Alice the string b so that she can guess the string a.

Bob builds b from a as follows: he writes all the substrings of length 2 of the string a in the order from left to right, and then joins them in the same order into the string b.

For example, if Bob came up with the string a="abac", then all the substrings of length 2 of the string a are: "ab", "ba", "ac". Therefore, the string b="abbaac".

You are given the string b. Help Alice to guess the string a that Bob came up with. It is guaranteed that b was built according to the algorithm given above. It can be proved that the answer to the problem is unique.

Input
The first line contains a single positive integer t (1≤t≤1000) — the number of test cases in the test. Then t test cases follow.

Each test case consists of one line in which the string b is written, consisting of lowercase English letters (2≤|b|≤100) — the string Bob came up with, where |b| is the length of the string b. It is guaranteed that b was built according to the algorithm given above.

Output
Output t answers to test cases. Each answer is the secret string a, consisting of lowercase English letters, that Bob came up with.

*/

import java.util.Scanner;

public class short_substrings {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++) {
            run(in.nextLine());
        }
    }

    public static void run(String s) {
        StringBuilder t = new StringBuilder();
        int l = s.length();
        // THE SAME CHAR IS REPEATED TWICE
        // SO WE JUST USE THEM TO BUILD ANOTHER STRING
        t.append(s.charAt(0));
        int i = 1;
        while (i < l) {
            t.append(s.charAt(i));
            i += 2;
        }
        System.out.println(t.toString());
    }
    /*
     * PROGRAM WORKS WELL
     * 
     * Time : 218 ms
     * Memory : 0 KB
     * Tests : 12
     * https://codeforces.com/contest/1367/submission/160074854
     * 
     */
}
