import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0; 
        int num = 0;
        int [] sum = new int[30];
        for(int i=0;i<strArr.length;i++){
             num = strArr[i].length();
             sum[num-1]++;
        }
        num = sum[0];
        for(int i=0;i<sum.length;i++){
            if(num < sum[i]){
                num = sum[i];
            }
        }
        return answer = num;
    }
}