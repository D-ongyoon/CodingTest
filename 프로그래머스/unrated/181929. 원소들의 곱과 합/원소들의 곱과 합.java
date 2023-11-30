import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        answer = (Arrays.stream(num_list).reduce((x, y) -> x * y).getAsInt() < Math.pow(Arrays.stream(num_list).sum(), 2)) ? 1 : 0;
        return answer;
    }
}