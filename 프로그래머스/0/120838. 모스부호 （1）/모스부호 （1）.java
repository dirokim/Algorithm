import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer = "";
        int num = 0;
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String [] sum = letter.split(" ");
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<morse.length;j++){
                if(sum[i].equals(morse[j])){
                    num = j+97;
                    answer += ""+(char)num;
                    break;
                }
            }
        }
        return answer;
    }
}