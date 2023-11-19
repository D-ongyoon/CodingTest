import java.util.stream.LongStream;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        answer = LongStream.rangeClosed(1, count).map(i -> i * price).sum();
        answer = money >= answer ? 0 : answer - money;
        return answer;
    }
}