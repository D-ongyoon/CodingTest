import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] question = s.split("");
        Arrays.sort(question, Collections.reverseOrder());
        answer = String.join("" ,question);
        return answer;
    }
}