import java.util.Arrays;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == false) {
                absolutes[i] = absolutes[i] * -1;
            }
        }
        answer = Arrays.stream(absolutes).sum();
        return answer;
    }
}