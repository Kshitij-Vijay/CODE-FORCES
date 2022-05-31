/*

<QUESTION> 282A - 21 :                      BIT PROGRAMMING

time limit per test : 1 second
memory limit per test : 256 megabytes

The classic programming language of Bitland is Bit++. This language is so peculiar and complicated.

The language is that peculiar as it has exactly one variable, called x. Also, there are two operations:

Operation ++ increases the value of variable x by 1.
Operation -- decreases the value of variable x by 1.
A statement in language Bit++ is a sequence, consisting of exactly one operation and one variable x. The statement is written without spaces, that is, it can only contain characters "+", "-", "X". Executing a statement means applying the operation it contains.

A programme in Bit++ is a sequence of statements, each of them needs to be executed. Executing a programme means executing all the statements it contains.

You're given a programme in language Bit++. The initial value of x is 0. Execute the programme and find its final value (the value of the variable when this programme is executed).

Input
The first line contains a single integer n (1 ≤ n ≤ 150) — the number of statements in the programme.

Next n lines contain a statement each. Each statement contains exactly one operation (++ or --) and exactly one variable x (denoted as letter «X»). Thus, there are no empty statements. The operation and the variable can be written in any order.

Output
Print a single integer — the final value of x.

*/

import java.util.Scanner;

public class bit_programming {
    static Scanner in = new Scanner(System.in);
    static int w = 0; // w is the global variable that will be operated
    // my logic is to break the given string into functional code then operate on this integer
    public static void main(String[] args) {
        int t = Integer.parseInt(in.nextLine());// test cases
        for (int i = 0; i < t; i++) {
            decode(in.nextLine());// inputing each line onto the method
        }
        System.out.println(w);
        // printing the output after w has been processed
    }

    public static void decode(String s) {
        char f = s.charAt(0);// first index
        char r = s.charAt(1);// second index
        char y = s.charAt(2);// third index
        // the below statements recognise the function to be done and perform it on w.
        if (f == 'X' && r == '+') {
            w++;
        } else if (f == 'X' && r == '-') {
            w--;
        } else if (f == '+' && y == 'X') {
            ++w;
        } else if (f == '-' && y == 'X') {
            --w;
        }
    }

    /*
    PROGRAM WORKS WELL

    Time : 202 ms
    Memory : 0 KB

    */
}
