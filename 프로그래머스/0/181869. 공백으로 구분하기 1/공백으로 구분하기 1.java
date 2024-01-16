import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        answer = Stream.of(my_string.split(" ")).toArray(String[]::new);
        return answer;
    }
}