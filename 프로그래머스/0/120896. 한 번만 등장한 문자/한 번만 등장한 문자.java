import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String sum = "";
        boolean check = true;
        for(int i=0;i<s.length();i++){
            check =true;
            sum = ""+s.charAt(i);
            for(int j=0;j<s.length();j++){
                if(i==j){
                    continue;
                }
                if(sum.equals(""+s.charAt(j))){
                    check = false;
                    break;
                }    
            }
            if(check == true){
                answer += sum;
            }
        }
        char [] array = new char[answer.length()];
        for(int k=0;k<answer.length();k++){
            array[k] = answer.charAt(k);
        }
        Arrays.sort(array);
        answer = "";
        for(char a:array){
            answer +=""+a;
        }
        return answer;
    }
}