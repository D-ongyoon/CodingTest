class Solution {
    public int solution(int age) {
        int answer = 2022;
        if (age > 0 && age <= 120) {
            answer = (answer - age) + 1;
        }
        return answer;
    }
}