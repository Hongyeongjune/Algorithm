package 프로그래머스.Programmers_나라의숫자124;

public class Others {
    public static String solution(int n) {
        String[] num = {"4", "1", "2"};
        String answer = "";

        while (n > 0) {
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
