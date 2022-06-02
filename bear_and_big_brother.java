/*

<QUESTIONS>  791A - 11 :                BEAR AND BIG BROTHER

time limit per test1 second
memory limit per test256 megabytes
inputstandard input
outputstandard output
Bear Limak wants to become the largest of bears, or at least to become larger than his brother Bob.

Right now, Limak and Bob weigh a and b respectively. It's guaranteed that Limak's weight is smaller than or equal to his brother's weight.

Limak eats a lot and his weight is tripled after every year, while Bob's weight is doubled after every year.

After how many full years will Limak become strictly larger (strictly heavier) than Bob?

Input
The only line of the input contains two integers a and b (1 ≤ a ≤ b ≤ 10) — the weight of Limak and the weight of Bob respectively.

Output
Print one integer, denoting the integer number of years after which Limak will become strictly larger than Bob.

*/

import java.util.Scanner;

public class bear_and_big_brother {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int l = Integer.parseInt(in.next());// Lamark's weight
        int b = Integer.parseInt(in.next());// Bob's weight
        int count = 0;// int to count the number of years passed
        while (l <= b) {// we use <= if in the case Lamark and bob are equal
            // as Lamrk increases by 3 and Bob by 2
            l = l * 3;
            b = b * 2;
            count++;
            // increamenting the bount of every year
        }
        System.out.println(count);
    }
    /*
     * 
     * RPOGRAM WORKS WELL
     * 
     * Time : 248 ms
     * Memory : 0 KB
     * Tests : 62
     * https://codeforces.com/contest/791/submission/159251234
     * 
     */
}
