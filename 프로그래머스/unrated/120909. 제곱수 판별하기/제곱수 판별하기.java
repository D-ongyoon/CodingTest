import java.util.Collections;
import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = IntStream.rangeClosed(1, (int) Math.sqrt(n)).boxed().sorted(Collections.reverseOrder()).mapToInt(x -> x * x).anyMatch(x -> x == n) ? 1 : 2;
        return answer;
    }
}