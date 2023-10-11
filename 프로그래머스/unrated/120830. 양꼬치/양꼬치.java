class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int srv = 0;
        srv = n/10;
        answer = (12000*n)+((k-srv)*2000);
        return answer;
    }
}