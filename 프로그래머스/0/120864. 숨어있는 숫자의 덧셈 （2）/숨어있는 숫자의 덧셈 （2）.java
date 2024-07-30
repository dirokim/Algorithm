import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.toUpperCase();
        for(int i=65;i<=90;i++){
                my_string = my_string.replaceAll(""+(char)i,",");
        }
        String [] sum = my_string.split(",");
        for(String a:sum){
            if(!a.equals("")){
                answer += Integer.parseInt(a);
            }
        }
        return answer;
    }
}