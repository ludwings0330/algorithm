package programmers;

public class 음양_더하기 {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer += (absolutes[i])* ((signs[i])?1:-1);
        }

        return answer;
    }
}
