package baeckjoon.BOJ2644;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class Main {
    static class Info {
        public Info(int current, int depth) {
            this.current = current;
            this.depth = depth;
        }

        int current;
        int depth;
    }

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int n = Integer.parseInt(br.readLine());

        int[] target = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int m = Integer.parseInt(br.readLine());

        int[] parent = new int[n + 1];
        int[] depth = new int[n + 1];
        Arrays.fill(depth, -1);
        int answer = -1;

        for (int i = 0; i < m; i++) {
            final int[] node = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            // node[0] : parent
            // node[1] : child
            parent[node[1]] = node[0];
        }

        Deque<Info> dq = new ArrayDeque<>();
        dq.add(new Info(target[0], 0));
        dq.add(new Info(target[1], 0));
        depth[target[0]] = depth[target[1]] = 0;

        while (!dq.isEmpty()) {
            final Info popedInfo = dq.pollFirst();
            int nextParent = parent[popedInfo.current];
            if (nextParent == 0) {
                continue;
            }
            int nextDepth = depth[popedInfo.current] + 1;

            if (depth[nextParent] != -1) {
                answer = depth[nextParent] + nextDepth;
                break;
            }
            depth[nextParent] = nextDepth;
            dq.add(new Info(nextParent, depth[nextParent]));
        }

        bw.write(answer + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
