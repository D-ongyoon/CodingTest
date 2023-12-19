import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        answer = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).limit(2).reduce((a, b) -> a * b).orElse(0);
        return answer;
    }
}