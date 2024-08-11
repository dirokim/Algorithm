import java.util.*;
public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        int num = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != num){
                num = arr[i];
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int j=0;j<list.size();j++){
            answer[j] = list.get(j);
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(list.size());
        return answer;
    }
}