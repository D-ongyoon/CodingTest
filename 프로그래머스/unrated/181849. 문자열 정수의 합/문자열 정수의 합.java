import java.util.stream.Stream;

class Solution {
    public int solution(String num_str) {
        int answer = 0;
        answer = Stream.of(num_str.split("")).mapToInt(Integer::parseInt).sum();
        return answer;
    }
}