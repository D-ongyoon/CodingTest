import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] changeStr = String.valueOf(n).split("");
        Arrays.sort(changeStr, Collections.reverseOrder());
        String temp = Arrays.stream(changeStr).collect(Collectors.joining(""));
        answer = Long.parseLong(temp);
        return answer;
    }
}