class Solution {
    public int solution(String s) {
        int answer = 0;
        String [] sum = s.split(" ");
        for(int i=0;i<sum.length;i++){
            if(sum[i].equals("Z")){
                answer-= Integer.parseInt(sum[i-1]);
            }else{
             answer+= Integer.parseInt(sum[i]);   
            }
        }
        return answer;
    }
}