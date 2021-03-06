package 해커랭크.ClimbingTheLeaderboard;

import java.util.*;

class Result {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here

        List<Integer> answer = new ArrayList<>();

        // 중복을 없애기 위해서 Set 선언 후 ranked 리스트 삽입
        Set<Integer> set = new HashSet<>();
        for (int r : ranked) set.add(r);

        // 순서를 나타내기 위해서 Set 값을 리스트에 담고 내림차순 정렬
        List<Integer> total = new ArrayList<>(set);
        Collections.sort(total, Collections.reverseOrder());

        int index = total.size() - 1;

        for (int i = 0; i < player.size(); i++) {
            // Rank 값을 모두 검사
            while (index >= 0) {
                // 플레이어의 값이 현재 랭크의 값 보다 작으면 그 밑에 인덱스를 answer 에 삽입
                if (player.get(i) < total.get(index)) {
                    answer.add(index + 2);
                    break;
                }
                // Rank 인덱스 줄이기
                index--;
            }
            // Rank 의 index 가 가장 아래까지 내려가면 무조건 1등을 추가하면 됨
            if (index < 0) {
                answer.add(1);
            }
        }

        return answer;
    }

}