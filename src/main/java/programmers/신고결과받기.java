package programmers;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 이용자의 ID가 담긴 문자열 배열 id_list
 * 각 이용자가 신고한 이용자의 ID 정보가 담긴 문자열 배열 report
 * 정기 지군이 되는 신고횟수 k
 *
 */
public class 신고결과받기 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

        Solution solution = new Solution();
        int[] answer = solution.solution(id_list, report, k);

        Arrays.stream(answer)
                .forEach(a -> System.out.print(a + " "));
    }

    static class Solution {
        public int[] solution(String[] id_list, String[] reports, int k) {
            int length = id_list.length;
            int[] answer = new int[length];
            int sequence = 0;

            HashMap<String, Integer> hash = new HashMap<>();

            for (String id :
                    id_list) {
                hash.put(id, sequence++);
            }

            int[][] board = new int[length][length];
            int[] reportCount = new int[length];

            for (String report :
                 reports) {
                String[] user = report.split(" ");
                int reporterId = hash.get(user[0]);
                int suspectId = hash.get(user[1]);

                if (board[reporterId][suspectId] == 0) {
                    board[reporterId][suspectId] = 1;
                    reportCount[suspectId] += 1;
                }
            }

            for (int reporterId = 0; reporterId < length; reporterId++) {
                for (int suspectId = 0; suspectId < length; suspectId++) {
                    if (board[reporterId][suspectId] == 1 && reportCount[suspectId] >= k) {
                        answer[reporterId] += 1;
                    }
                }
            }

            return answer;
        }
    }
}
