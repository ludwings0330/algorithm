package programmers;

import java.util.Arrays;

/**
 * 6개 일치 : 1등
 * 5개 일치 : 2등
 * 4개 일치 : 3등
 * 3개 일치 : 4등
 * 2개 일치 : 5등
 * 1개 이하 : 6등
 */
public class 로또의최고순위와최저순위 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        Solution solution = new Solution();
        int[] answer = solution.solution(lottos, win_nums);
        System.out.println("answer[0] = " + answer[0] + ", answer[1] = " + answer[1]);
    }

    static class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int hitCount = 0;
            int unknownCount = 0;
            Arrays.sort(lottos);
            Arrays.sort(win_nums);

            for (int i = 0; i < lottos.length; i++) {
                if (lottos[i] == 0) {
                    unknownCount ++;
                    continue;
                }

                for (int j = 0; j < win_nums.length; j++) {
                    if (lottos[i] == win_nums[j]) {
                        hitCount ++;
                        break;
                    }
                }
            }
            answer[0] = (hitCount + unknownCount <= 1) ? 6 : 7 - (hitCount + unknownCount);
            answer[1] = (hitCount <= 1) ? 6 : 7 - hitCount;

            return answer;
        }
    }
}
