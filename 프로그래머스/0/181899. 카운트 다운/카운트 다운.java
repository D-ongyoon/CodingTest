import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = {};
        answer = IntStream.rangeClosed(end_num, start).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
        return answer;
    }
}