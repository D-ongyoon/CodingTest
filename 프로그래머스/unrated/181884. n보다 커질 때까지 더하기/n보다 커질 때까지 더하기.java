import java.util.Arrays;

class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        answer = Arrays.stream(numbers).reduce(0, (x, y) -> n < x ? x : x + y);
        return answer;
    }
}