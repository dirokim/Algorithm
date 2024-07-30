import java.util.*;
class Solution {
    public List<String> solution(String myString) {
        String [] answer = myString.replace(" ","").split("x");
        Arrays.sort(answer);
        List<String>list = new ArrayList<String>();
        for(String a:answer){
            if(!a.equals("")){
                list.add(a);
            }
        }
        return list;
    }
}