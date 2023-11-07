import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length == 1) return new int[] {-1};
        int min = IntStream.of(arr).min().getAsInt();
        answer = Arrays.stream(arr).filter(i -> i != min).toArray();
        return answer;
    }
}