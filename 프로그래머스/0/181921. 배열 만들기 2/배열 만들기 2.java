import java.util.*;
class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> list = new ArrayList<Integer>();
        String sum ="";
        for(int i=l;i<=r;i++){
            sum = ""+i;
            sum = sum.replaceAll("0","");
            sum = sum.replaceAll("5","");
            if(sum.equals("")){
                list.add(i);
            }
        }
        if(list.size()==0){
            list.add(-1);
        }
        return list;
    }
}