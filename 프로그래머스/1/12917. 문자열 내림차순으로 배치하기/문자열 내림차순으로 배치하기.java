import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = s;
        String [] strArray = answer.split("");
        Collections.sort(Arrays.asList(strArray));
        Collections.reverse(Arrays.asList(strArray));
        answer = String.join("", strArray);
        return answer;
    }
}