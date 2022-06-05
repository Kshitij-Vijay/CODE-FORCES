/*

<QUESTION> 520A - 24 :                          PANAGRAM

time limit per test : 2 seconds
memory limit per test : 256 megabytes

A word or a sentence in some language is called a pangram if all the characters of the alphabet of this language appear in it at least once. Pangrams are often used to demonstrate fonts in printing or test the output devices.

You are given a string consisting of lowercase and uppercase Latin letters. Check whether this string is a pangram. We say that the string contains a letter of the Latin alphabet if this letter occurs in the string in uppercase or lowercase.

Input
The first line contains a single integer n (1 ≤ n ≤ 100) — the number of characters in the string.

The second line contains the string. The string consists only of uppercase and lowercase Latin letters.

Output
Output "YES", if the string is a pangram and "NO" otherwise.

*/

import java.util.Scanner;
import java.util.HashSet;

public class panagram {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int l = Integer.parseInt(in.nextLine());
        String s = in.nextLine();
        // if the length of l is less than 26 then it is bound not to have all the
        // characters
        if (l >= 26) {
            printing(check(s));
            // still as some may be repeated we need to check
        } else {
            System.out.println("NO");
        }
    }

    public static boolean check(String s) {
        HashSet<Character> h = new HashSet<>();
        // in hash set elements cannot repeat
        int l = s.length();
        s = s.toLowerCase();
        // hash set is case sensitive so we convert into lower case
        for (int i = 0; i < l; i++) {
            h.add(s.charAt(i));
            // adding each element
        }
        boolean b = false;
        if (h.size() == 26) {
            // if the size of the hash set is 26 then it exactly contains all the differnt
            // characters
            b = true;
        }
        return b;
    }

    public static void printing(boolean b) {
        // this method prints YES or NO
        // according to boolean b
        if (b == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
    /*
     * PROGRAM WORKS WELL
     * 
     * Time : 187 ms
     * Memory : 0 KB
     * Tests : 59
     * https://codeforces.com/contest/520/submission/159519090
     * 
     */
}
