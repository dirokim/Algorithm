import java.math.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        if(Character.isDigit(s.charAt(0))){
            answer = Integer.parseInt(s);
        }else if(s.charAt(0)=='-'){
            s = s.replace("-","");
            answer -= Integer.parseInt(s);
        }else if(s.charAt(0)=='+'){
            s = s.replace("+","");
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}