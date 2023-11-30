import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = Arrays.stream(num_list).sum();
        int multi = Arrays.stream(num_list).reduce(1, (x, y) -> x * y);
        int square = sum * sum;
        if (multi < square) {
             answer = 1;
        }
        return answer;
    }
}