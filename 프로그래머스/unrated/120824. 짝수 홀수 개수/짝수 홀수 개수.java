import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = IntStream.of(
                (int) Arrays.stream(num_list).filter(x -> x % 2 == 0).count()
              , (int) Arrays.stream(num_list).filter(x -> x % 2 == 1).count()
        ).toArray();
        return answer;
    }
}