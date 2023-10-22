import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        answer = new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
        return answer;
    }
}