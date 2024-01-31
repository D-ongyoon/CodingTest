class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] vowels = {"a", "e", "i", "o", "u"};
        for (String vowel : vowels) {
            if (my_string.contains(vowel)) {
                answer = my_string.replaceAll(vowel, "");
                my_string = answer;
            } else {
                answer = my_string;
            }
        }
        return answer;
    }
}