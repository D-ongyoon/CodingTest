import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        answer = IntStream.range(0, 10).filter(i -> Arrays.stream(numbers).noneMatch(j -> i == j)).sum();
        return answer;
    }
}