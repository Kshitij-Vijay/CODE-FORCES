import java.util.Scanner;

public class Next_round {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(in.next());
        int k = Integer.parseInt(in.next());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(in.next());
        }
        int y = arr[k - 1];
        if (y > 0) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] >= y && arr[i] > 0) {
                    count++;
                }
                System.out.println(count);
            }
        } else {
            System.out.println(0);
        }
    }
}
