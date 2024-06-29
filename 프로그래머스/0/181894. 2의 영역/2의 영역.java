import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int start = 0;
        int end = 0;
        boolean check = true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2&&check==true){
                start = i;
                check = false;
            }else if(arr[i]==2&&check==false){
                end = i;
            }
        }
        if(check==true){
            answer.add(-1);
        }else if(check==false&&end==0){
            answer.add(2);
        }else if(check==false&&end>0){
            for(int j=start;j<=end;j++){
            answer.add(arr[j]);
        }
        }
        return answer;
    }
}