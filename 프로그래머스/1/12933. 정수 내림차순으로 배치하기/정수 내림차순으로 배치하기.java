import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] changeStr = String.valueOf(n).split("");
        Arrays.sort(changeStr, Collections.reverseOrder());
        String temp = "";
        for (String str : changeStr)
            temp += str;
        answer = Long.parseLong(temp);
        return answer;
    }
}