import java.util.*;
class Solution {
    public List<String> solution(String myStr) {
        List<String>list = new ArrayList<String>();
        myStr = myStr.replace("a","c");
        myStr = myStr.replace("b","c");
        String [] sum =  myStr.split("c");
        for(int i=0;i<sum.length;i++){
            if(!sum[i].equals("")){
             list.add(sum[i]);   
            }
        }
        if(sum.length==0){
            list.add("EMPTY");
        }
        return list;
    }
}