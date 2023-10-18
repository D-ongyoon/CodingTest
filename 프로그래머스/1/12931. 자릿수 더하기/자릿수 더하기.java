import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String changeStr = Integer.toString(n);
        for (int i=0; i<changeStr.length(); i++) {
            answer += Integer.parseInt(changeStr.substring(i, i+1));
        }
        return answer;
    }
}