import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        int check;
        String answer = "";
        Arrays.sort(indices);
        for(int i=0;i<my_string.length();i++){
            check=0;
            for(int j=0;j<indices.length;j++){
                if(i==indices[j]){
                    check++;
                }
            }
            if(check==0){
                answer+=my_string.charAt(i);
            }
        }
        return answer;
    }
}