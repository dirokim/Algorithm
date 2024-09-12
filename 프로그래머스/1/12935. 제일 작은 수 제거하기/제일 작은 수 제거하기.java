import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Collections.sort(list);
        answer = new int[list.size()];
        if(list.size() > 1){
            list.remove(0);
        }else if(list.size() == 1){
            answer[0] = -1;
            return answer;
        }
        answer = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<list.size();j++){
                if(arr[i]==list.get(j)){
                    list2.add(arr[i]);
                }
            }
        }
        for(int i=0;i<list2.size();i++){
            answer[i] = list2.get(i);
        }
        return answer;
    }
}