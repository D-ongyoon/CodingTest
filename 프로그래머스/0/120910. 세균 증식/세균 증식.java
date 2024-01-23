import java.util.stream.IntStream;

class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        answer = IntStream.range(0, t).reduce(n, (a, b) -> a * 2);
        return answer;
    }
}