package codingTest;

import java.util.Scanner;

public class BJ_9095 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            arr = new int[n+1];
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 4;
            for (int j = 4; j <= n; j++) {
                arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
            }
            System.out.println(arr[n]);


        }
    }
}
