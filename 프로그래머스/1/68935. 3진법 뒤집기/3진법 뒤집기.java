class Solution {
    public int solution(int n) {
        int answer = 0;
        String toStr = "";
        while (n != 0) {
            toStr += n % 3;
            n /= 3;
        }
        answer = Integer.parseInt(toStr, 3);
        return answer;
    }
}