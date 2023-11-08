import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        int[] toArray = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = Arrays.stream(toArray).min().getAsInt();
        int max = Arrays.stream(toArray).max().getAsInt();
        answer =  (min + " " + max);
        return answer;
    }
}