class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        answer = new int[]{a, n * m / a};
        return answer;
    }
}