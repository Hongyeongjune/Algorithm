package 연습문제.문자열을정수로바꾸기;

public class Solution {
    public int solution(String s) {
        int answer = 0;

        if (s.charAt(0) == '+') answer = Integer.parseInt(s.substring(1));
        else answer = Integer.parseInt(s);

        return answer;
    }
}
