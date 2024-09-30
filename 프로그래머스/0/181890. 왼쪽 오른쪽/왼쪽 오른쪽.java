import java.util.*;
class Solution {
    public List<String> solution(String[] str_list) {
        List<String> list = new ArrayList<String>();
        int num = 0;
        int chk = 0;
        for(int i=0;i<str_list.length;i++){
            if(str_list[i].equals("l")){        // 왼쪽인경우
                num = i;
                chk = 2;
                break;
            }else if(str_list[i].equals("r")){  // 오른쪽인 경우
                num = i;
                chk = 3;
                break;
            } 
        }
        if(chk==2){
            if(num==0)return list;
            for(int i=0;i<num;i++){
                list.add(str_list[i]);
            }
        }else if(chk ==3){
            if(num==str_list.length-1)return list;
            for(int i=num+1;i<str_list.length;i++){
                list.add(str_list[i]);
            }
        }
        return list;
    }
}