import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        List<Integer>list = new ArrayList<Integer>();
            for(int i=0;i<emergency.length;i++){
                list.add(emergency[i]);
            }
        Collections.sort(list);
        Collections.reverse(list);
            for(int i=0;i<emergency.length;i++){
                for(int j=0;j<list.size();j++){
                    if(emergency[i]==list.get(j)){
                        answer[i] = j+1;
                    }
                }
            }
        return answer;
    }
}