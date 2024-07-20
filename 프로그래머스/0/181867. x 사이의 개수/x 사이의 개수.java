import java.util.*;
class Solution {
    public List<Integer> solution(String myString) {
        List<Integer>list = new ArrayList<Integer>();
        int check = 0;
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i)=='x'){
                list.add(check);
                check=0;
            }else{
                check++;    
            }
            if(i==myString.length()-1){
                list.add(check);
            }
        }
        return list;
    }
}