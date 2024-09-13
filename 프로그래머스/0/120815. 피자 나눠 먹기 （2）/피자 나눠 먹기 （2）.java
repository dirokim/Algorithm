class Solution {
    public int solution(int n) {
        int answer = 0;
            for(int i=0;i<=n*6;i=i+6){
                if(i > 0){
                    answer++;
                }
                if(i%n==0 && i != 0){
                    break;
                };
            }  
        return answer;
    }
}