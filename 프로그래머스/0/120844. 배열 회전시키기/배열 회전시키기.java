import java.util.*;
class Solution {
    public List<Integer> solution(int[] numbers, String direction) {
        List<Integer>list = new ArrayList<Integer>();
        for(int a:numbers){
            list.add(a);
        }
        if(direction.equals("left")){
            list.remove(0);
            list.add(numbers[0]);
        }else{
            list.remove(numbers.length-1);
            list.add(0,numbers[numbers.length-1]);
        }
        return list;
    }
}