class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        answer = s.chars().filter(e -> e == 'p').count() == s.chars().filter(e -> e == 'y').count();
        return answer;
    }
}