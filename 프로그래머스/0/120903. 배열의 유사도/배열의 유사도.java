import java.util.Arrays;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        answer = (int) Arrays.stream(s1).flatMap(x -> Arrays.stream(s2).filter(x::equals)).count();
        return answer;
    }
}