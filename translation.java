/*

<QUESTION> 41A - 9 :                                TRANSLATION

time limit per test : 2 seconds
memory limit per test : 256 megabytes

The translation from the Berland language into the Birland language is not an easy task. Those languages are very similar: a berlandish word differs from a birlandish word with the same meaning a little: it is spelled (and pronounced) reversely. For example, a Berlandish word code corresponds to a Birlandish word edoc. However, it's easy to make a mistake during the «translation». Vasya translated word s from Berlandish into Birlandish as t. Help him: find out if he translated the word correctly.

Input
The first line contains word s, the second line contains word t. The words consist of lowercase Latin letters. The input data do not consist unnecessary spaces. The words are not empty and their lengths do not exceed 100 symbols.

Output
If the word t is a word s, written reversely, print YES, otherwise print NO.

*/

import java.util.Scanner;

public class translation {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String s = in.nextLine();// the string
        String t = in.nextLine();// reversed string

        // printing the output
        if (reverse(s).compareTo(t) == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static String reverse(String s) {
        // this method is to get the reversed string
        String r = "";
        int l = s.length();
        while (l > 0) {
            l--;
            r = r + s.charAt(l);
        }
        return r;
    }
    /*
     * PROGRAM WORKS WELL
     * 
     * Time : 436
     * Memory : 8 KB
     * Tests : 40
     * https://codeforces.com/contest/41/submission/159481699
     * 
     */
}
