/*

<QUESTION> 339A - 11 :                      HELPFULL MATH

time limit per test : 2 seconds
memory limit per test : 256 megabytes

Xenia the beginner mathematician is a third year student at elementary school. She is now learning the addition operation.

The teacher has written down the sum of multiple numbers. Pupils should calculate the sum. To make the calculation easier, the sum only contains numbers 1, 2 and 3. Still, that isn't enough for Xenia. She is only beginning to count, so she can calculate a sum only if the summands follow in non-decreasing order. For example, she can't calculate sum 1+3+2+1 but she can calculate sums 1+1+2 and 3+3.

You've got the sum that was written on the board. Rearrange the summans and print the sum in such a way that Xenia can calculate the sum.

Input
The first line contains a non-empty string s — the sum Xenia needs to count. String s contains no spaces. It only contains digits and characters "+". Besides, string s is a correct sum of numbers 1, 2 and 3. String s is at most 100 characters long.

Output
Print the new sum that Xenia can count.

*/

import java.util.Scanner;

public class Helpful_Maths {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // in this algorithm we first count the total number of one's and two's and three's
        String s = in.nextLine();
        int f1 = 0, f2 = 0, f3 = 0;// frequency of 1,2,3;
        for (int i = 0; i < s.length(); i += 2) {
            // integers are only at even positions
            // whenever char == n we increament n's frequency
            if (s.charAt(i) == '1') {
                f1++;
            } else if (s.charAt(i) == '2') {
                f2++;
            } else if (s.charAt(i) == '3') {
                f3++;
            }
        }
        // refershing the value of s
        s = "";

        // now we just concat to a string adding according to increasing order
        for (int i = 0; i < f1; i++) {
            s = s.concat("1+");
        }
        for (int i = 0; i < f2; i++) {
            s = s.concat("2+");
        }
        for (int i = 0; i < f3; i++) {
            s = s.concat("3+");
        }

        // only in the end an extra '+' has been added 
        // so we remove it and print the output
        System.out.println(s.substring(0, s.length() - 1));
    }

    /*
    program works well 

    Time : 404 ms
    Memory : 0 KB
    Tests : 21
    https://codeforces.com/contest/339/submission/159081069
    
    */
}
