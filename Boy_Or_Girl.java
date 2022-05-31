/*

<QUESTION> 236A - 10 :                  BOY OR GIRL

time limit per test : 1 second
memory limit per test : 256 megabytes
 
Those days, many boys use beautiful girls' photos as avatars in forums. So it is pretty hard to tell the gender of a user at the first glance. Last year, our hero went to a forum and had a nice chat with a beauty (he thought so). After that they talked very often and eventually they became a couple in the network.

But yesterday, he came to see "her" in the real world and found out "she" is actually a very strong man! Our hero is very sad and he is too tired to love again now. So he came up with a way to recognize users' genders by their user names.

This is his method: if the number of distinct characters in one's user name is odd, then he is a male, otherwise she is a female. You are given the string that denotes the user name, please help our hero to determine the gender of this user by his method.

Input
The first line contains a non-empty string, that contains only lowercase English letters — the user name. This string contains at most 100 letters.

Output
If it is a female by our hero's method, print "CHAT WITH HER!" (without the quotes), otherwise, print "IGNORE HIM!" (without the quotes).

*/

import java.util.Scanner;

public class Boy_Or_Girl {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder(in.nextLine());
        // using StringBuilder it is easier to operate as one can remove a char using
        // delete of stringBuilder method

        boolean b = res(s);
        // res is the method that returns the output in boolean for us to compare and
        // give output

        // the below lines check and display the result as per b
        if (b == true) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }

    public static boolean res(StringBuilder s) {// res inputs a string builder
        boolean b;// b is the returning variable
        int sum = 0;// variable that holds the total number of different characters
        while (s.length() != 0) {
            // in this algorithm we slowly reduce the lenght of the string
            // when we find the same repeated letter

            char c = s.charAt(0);
            // we first fix to a particular char at index 0

            // the for loop removes all the repeated char characters
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    // if the string has the same char at i'th position it is removed
                    s.deleteCharAt(i);
                    i--;
                    // as the string length is reduced by 1 due to removing a char
                    // we also have to reduce the i'th value so that at the begin of the loop again
                    // it gets nullified
                }
            }
            // after all the chars are removed we increament sum
            // the string length is reduced and no chars still remanin repeated
            // now sum holds the different number of chars as agian the value of c is
            // refreshed
            sum++;
        }

        // we then check if sum is even and decide variable b to be true or false
        if (sum % 2 == 0) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }
    /*
     * program works well
     * 
     * Time : 404 ms
     * Memory : 0 KB
     * Tests : 85
     * 
     */

}
