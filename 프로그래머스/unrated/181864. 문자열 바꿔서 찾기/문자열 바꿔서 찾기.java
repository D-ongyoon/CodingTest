import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        answer = myString.contains(Stream.of(pat.split("")).map(i -> "A".equals(i) ? "B" : "A").collect(Collectors.joining())) ? 1 : 0;
        return answer;
    }
}