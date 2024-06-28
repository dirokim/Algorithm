class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(int i=0;i<order.length;i++){
            order[i] = order[i].replace("ice","");
            order[i] = order[i].replace("hot","");
            if(order[i].equals("americano")){
                answer += 4500;
            }else if(order[i].equals("cafelatte")){
                answer += 5000;
            }else if(order[i].equals("anything")){
                answer += 4500;
            }
        }
        return answer;
    }
}