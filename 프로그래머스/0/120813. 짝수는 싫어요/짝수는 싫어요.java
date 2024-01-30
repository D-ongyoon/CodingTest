import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        answer = IntStream.rangeClosed(1, n).filter(i -> i % 2 == 1).toArray();
        return answer;
    }
}