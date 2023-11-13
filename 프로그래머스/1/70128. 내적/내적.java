import java.util.stream.IntStream;

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        answer = IntStream.range(0, a.length).map(i -> a[i] * b[i]).sum();
        return answer;
    }
}