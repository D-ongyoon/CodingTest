import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
            String replaceToStr = Arrays.stream(myString.split("")).map(i -> i.replace('A', 'Z').replace('B', 'A').replace('Z', 'B')).collect(Collectors.joining());
        if (replaceToStr.contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}