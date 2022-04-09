package baeckjoon.BOJ18258;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        final Deque<Integer> queue = new ArrayDeque<>();

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            String[] command = br.readLine().split(" ");

            if (command[0].equals("push")) {
                queue.add(Integer.parseInt(command[1]));
            } else if (command[0].equals("pop")) {
                Integer n = queue.poll();
                if (n == null) {
                    bw.write("-1");
                } else {
                    bw.write(n + "");
                }

                bw.newLine();
            } else if (command[0].equals("size")) {
                bw.write(queue.size() + "");
                bw.newLine();
            } else if (command[0].equals("empty")) {
                if (queue.isEmpty()) {
                    bw.write("1");
                } else {
                    bw.write(("0"));
                }

                bw.newLine();
            } else if (command[0].equals("front")) {
                bw.write((queue.peek() == null) ? "-1" : queue.peek() + "");
                bw.newLine();
            } else if (command[0].equals("back")) {
                bw.write((queue.peekLast() == null) ? "-1" : queue.peekLast() + "");
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
