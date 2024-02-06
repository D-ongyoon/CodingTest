import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], Math.max(sides[1], sides[2]));
        int sum = sides[0] + sides[1] + sides[2] - max;
        answer = max < sum ? 1 : 2;
        return answer;
    }
}