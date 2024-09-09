import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int chk = 0;
        Stack<String> stack = new Stack<String>();
        for(int i=0;i<s.length();i++){
            if(i==0){
                if(s.charAt(i)==')'){
                   chk++;
                   break;
                }    
            }
            if(s.charAt(i)=='('){
                stack.push("(");
            }else if(s.charAt(i)==')'){
                if(stack.empty()){
                    chk++;
                    break;
                }
                stack.pop();
            }
        }
        if(chk==0){
            if(stack.empty()){
                    answer = true;
                }
        }
        return answer;
    }
}