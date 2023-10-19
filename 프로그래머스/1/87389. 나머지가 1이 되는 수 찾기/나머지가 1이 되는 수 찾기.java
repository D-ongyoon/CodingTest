import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
        return answer;
    }
}