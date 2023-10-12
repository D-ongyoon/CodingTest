import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = Arrays.stream(num_list).boxed()
                        .collect(Collectors.collectingAndThen (
                            Collectors.toList(), l -> {Collections.reverse(l); return l;}
                        ))
                        .stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}