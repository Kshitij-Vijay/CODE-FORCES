/*

<QUESTION> 231A - 11 :          TEAM

time limit per test :  2 seconds
memory limit per test : 256 megabytes

One day three best friends Petya, Vasya and Tonya decided to form a team and take part in programming contests. Participants are usually offered several problems during programming contests. Long before the start the friends decided that they will implement a problem if at least two of them are sure about the solution. Otherwise, the friends won't write the problem's solution.

This contest offers n problems to the participants. For each problem we know, which friend is sure about the solution. Help the friends find the number of problems for which they will write a solution.

Input
The first input line contains a single integer n (1 ≤ n ≤ 1000) — the number of problems in the contest. Then n lines contain three integers each, each integer is either 0 or 1. If the first number in the line equals 1, then Petya is sure about the problem's solution, otherwise he isn't sure. The second number shows Vasya's view on the solution, the third number shows Tonya's view. The numbers on the lines are separated by spaces.

Output
Print a single integer — the number of problems the friends will implement on the contest.
*/

import java.util.Scanner;
// Scanner class for input
public class team {
    static Scanner in = new Scanner(System.in);
    // Scanner object
    public static void main(String[] args) {
        int t = Integer.parseInt(in.nextLine());// t is the integer that will hold the number of queries
        int big = 0;// this integer will hold the total number of positive test cases
        for (int i = 0; i < t; i++) {
            // test cases loop
            int count = 0;
            // counts the number of people who accepted
            for (int j = 0; j < 3; j++) {
                int w = Integer.parseInt(in.next());
                if (w == 1) {
                    count++;
                }
            }
            if (count > 1) {
                big++;
            }
        }
        System.out.println(big);
    }
    /* 
    this program works well

    Time : 436 ms
    Memory : 0 KB
    
    */
}
