import java.util.stream.IntStream;
class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n > 0 && n <= 1000) {
         answer = IntStream.rangeClosed(0, n)
            .filter(i -> i % 2 == 0)
            .sum();
        }
        return answer;
    }
}