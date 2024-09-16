import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        List<Integer>list = new ArrayList<Integer>();
        for(int i=0;i<array.length;i++){
            list.add(array[i]);
        }
        Collections.sort(list);
        int num = 0;
        int sum = 100;
        for(int i=0;i<list.size();i++){
            num = n - Math.abs(list.get(i));
            num = Math.abs(num);
            if(num < sum){
                sum = num;
                answer = list.get(i);
            }        
        }
        return answer;
    }
}