import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        answer = IntStream.rangeClosed(start_num, end_num).toArray();
        return answer;
    }
}