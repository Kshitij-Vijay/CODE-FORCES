/*

<QUESTION> 71A - 14  :      WAY TOO LONG WORDS

time limit per test : 1 second
memory limit per test : 256 megabytes

Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text is quite tiresome.

Let's consider a word too long, if its length is strictly more than 10 characters. All too long words should be replaced with a special abbreviation.

This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.

Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".

You are suggested to automatize the process of changing the words with abbreviations. At that all too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.

Input
The first line contains an integer n (1 ≤ n ≤ 100). Each of the following n lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.

Output
Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data.

*/

import java.util.Scanner;

public class way_too_long_words {
    static Scanner in = new Scanner(System.in);

    // I'm using Scanner class for input
    public static void main(String[] args) {
        int t = Integer.parseInt(in.nextLine());
        // t is the number of test cases
        for (int i = 0; i < t; i++) {
            // this loop runs until all the test case inputs are given are every input is
            // checked with output displayed
            String s = in.nextLine();
            check(s);
            // check method does all the work when we easily input a string into it
        }

    }

    public static void check(String s) {
        int l = s.length();
        // l will store the length of the string
        if (l > 10) {
            // we easily just output the word as per the question if the length is less than
            // 10
            String k = Character.toString(s.charAt(0))
                    .concat(Integer.toString(l - 2).concat(Character.toString(s.charAt(l - 1))));
            // here we convert the first and the last character to string and even the middle integer...then we just concat them all together
            System.out.println(k);
            // we give out eh output
        } else {
            System.out.println(s);
        }
    }
    /*
     * this program works and funtions well
     * 
     * Time : 187 ms
     * Memory : 0 KB
     * Tests : 20 
     * https://codeforces.com/contest/71/submission/158896510
     */

}
