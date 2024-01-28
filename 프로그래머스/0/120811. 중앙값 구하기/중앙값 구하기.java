import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        answer = Arrays.stream(array).sorted().skip(array.length / 2).findFirst().orElseThrow(RuntimeException::new);
        return answer;
    }
}