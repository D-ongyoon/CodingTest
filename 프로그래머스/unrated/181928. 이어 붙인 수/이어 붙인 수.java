class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddNumber = "";
        String evenNumber = "";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenNumber += Integer.toString(num_list[i]);
            } else {
                oddNumber += Integer.toString(num_list[i]);
            }
        }
        answer = Integer.parseInt(oddNumber) + Integer.parseInt(evenNumber);
        return answer;
    }
}