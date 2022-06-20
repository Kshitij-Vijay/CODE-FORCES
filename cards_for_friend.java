/*

<QUESTION> 1472A - 16 :                 CARDS FOR FRIENDS

time limit per test : 1 second
memory limit per test : 256 megabytes

For the New Year, Polycarp decided to send postcards to all his n friends. He wants to make postcards with his own hands. For this purpose, he has a sheet of paper of size w×h, which can be cut into pieces.

Polycarp can cut any sheet of paper w×h that he has in only two cases:

If w is even, then he can cut the sheet in half and get two sheets of size w2×h;
If h is even, then he can cut the sheet in half and get two sheets of size w×h2;
If w and h are even at the same time, then Polycarp can cut the sheet according to any of the rules above.

After cutting a sheet of paper, the total number of sheets of paper is increased by 1.

Help Polycarp to find out if he can cut his sheet of size w×h at into n or more pieces, using only the rules described above.

Input
The first line contains one integer t (1≤t≤104) — the number of test cases. Then t test cases follow.

Each test case consists of one line containing three integers w, h, n (1≤w,h≤104,1≤n≤109) — the width and height of the sheet Polycarp has and the number of friends he needs to send a postcard to.

Output
For each test case, output on a separate line:

"YES", if it is possible to cut a sheet of size w×h into at least n pieces;
"NO" otherwise.
You can output "YES" and "NO" in any case (for example, the strings yEs, yes, Yes and YES will be recognized as positive).

*/

import java.util.Scanner;

public class cards_for_friend {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(in.nextLine());
        for (; t > 0; t--) {
            run();
        }
    }

    public static void run() {
        int w = Integer.parseInt(in.next());
        int h = Integer.parseInt(in.next());
        int n = Integer.parseInt(in.next());
        // all the vars are as according to question
        int s = 1;
        // every time cutting we get *2 peices
        // so s carries that number of peices
        while (w % 2 == 0) {
            // check if the number is even and cut
            // according to rules
            w = w / 2;
            // diving by 2 is the same aas cutting
            s *= 2;
            // we are increamenting the number of peices
        }
        // the same as above is repeated for height
        while (h % 2 == 0) {
            h = h / 2;
            s *= 2;
        }
        // we compare and print the sum
        if (s >= n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    /*
     * PROGRAM WORKS WELL
     * 
     * Time : 296 ms
     * Memory : 0 KB
     * Tests : 14
     * https://codeforces.com/contest/1472/submission/161324832
     * 
     */
}
