/*

<QUESTION> 59A - 5 :                                    WORD

time limit per test : 2 seconds
memory limit per test : 256 megabytes

Vasya is very upset that many people on the Net mix uppercase and lowercase letters in one word. That's why he decided to invent an extension for his favorite browser that would change the letters' register in every word so that it either only consisted of lowercase letters or, vice versa, only of uppercase ones. At that as little as possible letters should be changed in the word. For example, the word HoUse must be replaced with house, and the word ViP — with VIP. If a word contains an equal number of uppercase and lowercase letters, you should replace all the letters with lowercase ones. For example, maTRIx should be replaced by matrix. Your task is to use the given method on one given word.

Input
The first line contains a word s — it consists of uppercase and lowercase Latin letters and possesses the length from 1 to 100.

Output
Print the corrected word s. If the given word s has strictly more uppercase letters, make the word written in the uppercase register, otherwise - in the lowercase one.

*/

import java.util.Scanner;

public class word {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String n = in.nextLine();
        doer(n);
        // main method is only to accept and give a string to the doer method
    }

    public static void doer(String n) {
        // this method does all the assembling work
        // and even prints the result
        System.out.println(convert(count_upper(n), n));
    }

    public static boolean count_upper(String n) {
        // this method count the total numeber of upper case characters
        int l = n.length();
        int c = 0; // variable to count the upper case characters
        boolean b = true;
        // b boolean decides wether to convert upper to lower of vice versa
        // false lower to upper
        // true upper to lower
        for (int i = 0; i < l; i++) {
            // loop to count the number of upper case letters
            if ((int) n.charAt(i) < 97) {
                c++;
            }
        }
        // checking if we have to go in upper to lower or vice versa
        if (c > (l - c)) {
            b = false;
        }
        return b;
    }

    public static String convert(boolean b, String n) {
        // this method converts according to b
        if (b == false) {
            n = n.toUpperCase();
        } else {
            n = n.toLowerCase();
        }
        return n;
    }
    /*
     * PROGRAM WORKS WELL
     * 
     * Time : 374 ms
     * Memory : 0 KB
     * Tests : 30
     * https://codeforces.com/contest/59/submission/159343576
     * 
     */
}
