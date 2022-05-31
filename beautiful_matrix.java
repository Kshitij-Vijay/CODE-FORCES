/*

<QUESTION> 263A - 8 :                   BEAUTIFUL MATRIX

time limit per test : 2 seconds
memory limit per test : 256 megabytes

You've got a 5 × 5 matrix, consisting of 24 zeroes and a single number one. Let's index the matrix rows by numbers from 1 to 5 from top to bottom, let's index the matrix columns by numbers from 1 to 5 from left to right. In one move, you are allowed to apply one of the two following transformations to the matrix:

Swap two neighboring matrix rows, that is, rows with indexes i and i + 1 for some integer i (1 ≤ i < 5).
Swap two neighboring matrix columns, that is, columns with indexes j and j + 1 for some integer j (1 ≤ j < 5).
You think that a matrix looks beautiful, if the single number one of the matrix is located in its middle (in the cell that is on the intersection of the third row and the third column). Count the minimum number of moves needed to make the matrix beautiful.

Input
The input consists of five lines, each line contains five integers: the j-th integer in the i-th line of the input represents the element of the matrix that is located on the intersection of the i-th row and the j-th column. It is guaranteed that the matrix consists of 24 zeroes and a single number one.

Output
Print a single integer — the minimum number of moves needed to make the matrix beautiful.

*/

import java.util.Scanner;

public class beautiful_matrix {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 0, y = 0;
        // i holds the row
        // j holds the column
        // the number one can be easily moved around the matrix
        // below loops find the position of 1 in the matrix
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (Integer.parseInt(in.next()) == 1) {
                    x = i;
                    y = j;
                    // we exit the loops after finding the postions
                    break;
                }
            }
        }
        // now as 1 can easily move around the matrix.. if we just calculate the
        // distance between its current positon compared to 3,3 we get the answer

        x = Math.abs(3 - x);
        // x value is updated and abs of 3-x gives the distance that is need to be moved
        // in terms of rows

        y = Math.abs(3 - y);
        // y value is updated and abs of 3-x gives the distance that is need to be moved
        // in terms of columns

        // we add them both to get the total number of moves to be made
        System.out.println(x + y);
    }
    /*
     * program works well
     * 
     * Time : 372 ms
     * Memory : 0 KB
     * 
     */
}
