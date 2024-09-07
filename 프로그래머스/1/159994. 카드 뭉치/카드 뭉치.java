import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        ArrayList cardslist = new ArrayList(Arrays.asList(cards1));
        ArrayList cardslist2 = new ArrayList(Arrays.asList(cards2));
        for(int i=0;i<goal.length;i++){
            if(cardslist.size() > 0 && goal[i].equals(cardslist.get(0))){
                cardslist.remove(0);
            }else if(cardslist2.size()> 0 && goal[i].equals(cardslist2.get(0))){
                cardslist2.remove(0);
            }else{
                answer = "No";
            }
        }
        return answer;
    }
}