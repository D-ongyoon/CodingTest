class Solution {
    public int solution(String my_string) {
        int answer = 0;
        answer = my_string.chars().filter(Character::isDigit).map(Character::getNumericValue).sum();
        return answer;
    }
}