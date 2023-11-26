import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int index = 1;
        list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (list.get(index - 1) != arr[i]) {
                index++;
                list.add(arr[i]);
            }
        }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}