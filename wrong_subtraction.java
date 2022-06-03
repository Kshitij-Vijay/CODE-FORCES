/*

<QUESTION> 977A - 20 :                          WRONG SUBTRACTION

time limit per test : 1 second
memory limit per test : 256 megabytes

Little girl Tanya is learning how to decrease a number by one, but she does it wrong with a number consisting of two or more digits. Tanya subtracts one from a number by the following algorithm:

if the last digit of the number is non-zero, she decreases the number by one;
if the last digit of the number is zero, she divides the number by 10 (i.e. removes the last digit).
You are given an integer number n. Tanya will subtract one from it k times. Your task is to print the result after all k subtractions.

It is guaranteed that the result will be positive integer number.

Input
The first line of the input contains two integer numbers n and k (2≤n≤109, 1≤k≤50) — the number from which Tanya will subtract and the number of subtractions correspondingly.

Output
Print one integer number — the result of the decreasing n by one k times.

It is guaranteed that the result will be positive integer number.

*/

import java.util.Scanner;

public class wrong_subtraction {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(in.next());// the number
        int t = Integer.parseInt(in.next());// number of times the subtraction happens
        for (int i = 0; i < t; i++) {
            n = subtract(n);
        }
        System.out.println(n);
    }

    public static int subtract(int n) {
        // this method checks if the last number is 10 or not
        // depending upon that it subtracts
        if (n % 10 == 0) {
            n = n / 10;

        } else {
            n = n - 1;
        }
        return n;
    }
    /*
     * PROGRAM WORKS WELL
     * 
     * Time : 186 ms
     * Memory : 0 KB
     * Tests : 11
     * https://codeforces.com/contest/977/submission/159345687
     * 
     */
}
