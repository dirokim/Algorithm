import java.util.*;
class Solution {
    public int[] solution(long n) {
        String num = ""+n;
        String [] sum = num.split("");
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<sum.length;i++){
            list.add(Integer.parseInt(sum[i]));
        }
        Collections.reverse(list);
        int [] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}