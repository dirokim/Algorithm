import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer>list = new ArrayList<Integer>();
        int check = 0;
        for(int i=0;i<arr.length;i++){
            check = 0;
            for(int j=0;j<delete_list.length;j++){
                if(arr[i]==delete_list[j]){
                    check++;
                }
            }
            if(check==0){
                list.add(arr[i]);
            }
        }
        return list;
    }
}