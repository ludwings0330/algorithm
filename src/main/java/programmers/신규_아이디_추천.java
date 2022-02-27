package programmers;

public class 신규_아이디_추천 {
    public static void main(String[] args) {
        신규_아이디_추천 신규_아이디_추천 = new 신규_아이디_추천();
        String answer = 신규_아이디_추천.solution("abcdefghijklmn.p");
        System.out.println("answer = " + answer);
    }

    public String solution(String new_id) {
        String answer = "";

        answer = convertToLowercase(new_id);
        answer = removeUnmatchedChars(answer);
        answer = removeConsecutivePeriods(answer);
        answer = removeUnmatchedPeriods(answer);
        answer = addAifEmpty(answer);
        answer = matchMaxIdLength(answer);
        answer = matchMinIdLength(answer);

        return answer;
    }

    private String matchMinIdLength(String answer) {
        char ch = answer.charAt(answer.length()-1);

        while (answer.length() <= 2) {
            answer += ch;
        }

        return answer;
    }

    private String matchMaxIdLength(String answer) {
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }
        answer = answer.replaceAll("[.]$", "");
        return answer;
    }

    private String addAifEmpty(String answer) {
        if (answer.length() == 0) {
            answer = "a";
        }

        return answer;
    }

    private String removeUnmatchedPeriods(String answer) {
        return answer.replaceAll("^[.]|[.]$", "");
    }

    private String removeConsecutivePeriods(String answer) {
        return answer.replaceAll("\\.{2,}", ".");
    }

    private String removeUnmatchedChars(String answer) {
        return answer.replaceAll("[^\\w\\-_.]*", "");
    }


    private String convertToLowercase(String id) {
        return id.toLowerCase();
    }
}
