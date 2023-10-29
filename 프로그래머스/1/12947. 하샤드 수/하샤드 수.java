import java.util.Arrays;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int question = Arrays.asList(Integer.toString(x).split("")).stream().map(Integer::parseInt).reduce(0, (a, b) -> a + b);
        answer = x % question == 0;
        return answer;
    }
}