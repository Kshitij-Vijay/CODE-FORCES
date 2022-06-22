/*

<QUESTION> 935A - 14 :                      FAFA AND HIS COMPANY 

time limit per test : 1 second
memory limit per test : 256 megabytes

Fafa owns a company that works on huge projects. There are n employees in Fafa's company. Whenever the company has a new project to start working on, Fafa has to divide the tasks of this project among all the employees.

Fafa finds doing this every time is very tiring for him. So, he decided to choose the best l employees in his company as team leaders. Whenever there is a new project, Fafa will divide the tasks among only the team leaders and each team leader will be responsible of some positive number of employees to give them the tasks. To make this process fair for the team leaders, each one of them should be responsible for the same number of employees. Moreover, every employee, who is not a team leader, has to be under the responsibility of exactly one team leader, and no team leader is responsible for another team leader.

Given the number of employees n, find in how many ways Fafa could choose the number of team leaders l in such a way that it is possible to divide employees between them evenly.

Input
The input consists of a single line containing a positive integer n (2 ≤ n ≤ 105) — the number of employees in Fafa's company.

Output
Print a single integer representing the answer to the problem.

*/

import java.util.Scanner;

public class fafa_and_his_company {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(in.nextLine());
        int s = 0;
        for (int i = 1; i < n; i++) {
            // n-1 means we are subtracting those many employees as team leaders
            // then we check if it is possible to divide the remaining employees into same
            // groups under the leaders
            if (n % (n - i) == 0) {
                // every time possible we add one to out counter
                s++;
            }
        }
        System.out.println(s);
    }
    /*
     * PROGRAM WORKS WELL
     * 
     * Time : 187 ms
     * Memory : 0 KB
     * Tests : 33
     * https://codeforces.com/contest/935/submission/161494239
     * 
     */
}
