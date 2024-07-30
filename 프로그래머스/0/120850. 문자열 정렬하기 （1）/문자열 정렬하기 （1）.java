import java.util.*;
class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<my_string.length();i++){
            if(Character.isDigit(my_string.charAt(i))){
                list.add(Integer.parseInt(""+my_string.charAt(i)));
            }
        }
        Collections.sort(list);
        return list;
    }
}