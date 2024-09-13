import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<rank.length;i++){
            if(attendance[i]==true){
                list.add(rank[i]);
            }
        }
        Collections.sort(list); 
        int result  = 0;
        int result2 = 0;
        int result3 = 0;
        for(int j=0;j<rank.length;j++){
            if(list.get(0) == rank[j]){
                result = j;
            }else if(list.get(1) == rank[j]){
                result2 = j;
            }else if(list.get(2) == rank[j]){
                result3 = j;
            }
        }
        return answer = 10000 * result + 100 * result2 + result3;
    }
}