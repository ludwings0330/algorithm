package baeckjoon.BOJ4673;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nums = new int[10001];

        for (int i = 1 ; i < nums.length ; i++) {
            int next = d(i);

            if (next <= 10000) {
                nums[next] = 1;
            }
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                System.out.println(i);
            }
        }
    }
    public static int d(int n) {
        int ret = n ;

        while (n > 0) {
            ret += n % 10;
            n /= 10;
        }

        return ret;
    }
}
