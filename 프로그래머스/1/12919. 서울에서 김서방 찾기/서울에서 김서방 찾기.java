import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        List<String> question = List.of(seoul);
        int index = IntStream.range(0, question.size()).filter(i -> Objects.equals(question.get(i), "Kim")).findFirst().orElse(-1);
        answer = "김서방은 " + index + "에 있다";
        return answer;
    }
}