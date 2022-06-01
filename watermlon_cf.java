/*

<QUESTION> 4A - 8 :             WATERMELON

time limit per test : 1 second
memory limit per test : 64 megabytes
 
One hot summer day Pete and his friend Billy decided to buy a watermelon. They chose the biggest and the ripest one, in their opinion. After that the watermelon was weighed, and the scales showed w kilos. They rushed home, dying of thirst, and decided to divide the berry, however they faced a hard problem.

Pete and Billy are great fans of even numbers, that's why they want to divide the watermelon in such a way that each of the two parts weighs even number of kilos, at the same time it is not obligatory that the parts are equal. The boys are extremely tired and want to start their meal as soon as possible, that's why you should help them and find out, if they can divide the watermelon in the way they want. For sure, each of them should get a part of positive weight.

Input
The first (and the only) input line contains integer number w (1 ≤ w ≤ 100) — the weight of the watermelon bought by the boys.

Output
Print YES, if the boys can divide the watermelon into two parts, each of them weighing even number of kilos; and NO in the opposite case.

*/

import java.util.Scanner;

public class watermlon_cf {
    static Scanner in = new Scanner(System.in);
    // we're using Scanner class input
    public static void main(String[] args) {
        int w = Integer.parseInt(in.next());
        // w has the weight of the watermelon
        boolean b = false;// this variable b contains our answer
        for (int i = 2; i < w; i += 2) {
            // i bgins with 2 so it is sure to be an even integer
            // even we are incrementing by 2, so i is always even
            if ((w - i) % 2 == 0) {
                // this condition checks if the other part is even 
                b = true;
                // we then change the controlling condition an exit quickly
                break;
            }
        }
        // printing the values according to b
        if (b == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    /*
    this program works well

    Time : 374 ms
    Memory : 0 KB
    Tests : 20
    https://codeforces.com/contest/4/submission/158894203
    
    */
}
