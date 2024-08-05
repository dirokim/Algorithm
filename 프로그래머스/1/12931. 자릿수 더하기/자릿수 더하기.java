import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String sum = ""+n;
        for(int i=0;i<sum.length();i++){
            answer+= Integer.parseInt(""+sum.charAt(i));
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        return answer;
    }
}