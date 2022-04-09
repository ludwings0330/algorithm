package baeckjoon.BOJ10799;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split("");
        // input <= 100_000
        int answer = 0;

        Stack<String> stack = new Stack<>();

        // 레이저인지 아닌지 판별 필요.
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("(")) {
                stack.add(input[i]);
            } else {
                stack.pop();

                if (input[i - 1].equals("(")) {
                    answer += stack.size();
                } else {
                    answer ++;
                }
            }
        }

        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
