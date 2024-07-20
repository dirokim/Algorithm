import java.util.*;
class Solution {
    public List<Integer> solution(int n) {
        boolean check = true;
        List<Integer>list = new ArrayList<Integer>();
        list.add(n);
        while(check){
            if(n%2==0){
                n = n/2;
            }else{
                n = 3*n+1;
            }
            if(n==1){
                list.add(n);
                break;
            }
            list.add(n);
        }
        return list;
    }
}