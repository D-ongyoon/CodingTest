class Solution {
    public int[] solution(int money) {
        int unitPrice = 5500;
        int share = money / unitPrice;
        int remain = money % unitPrice;
        int[] answer = new int[]{share, remain};
        return answer;
    }
}