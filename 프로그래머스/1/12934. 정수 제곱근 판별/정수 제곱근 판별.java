class Solution {
    public long solution(long n) {
        long answer = 1;
        boolean check = true;
        while(check){
            if(answer*answer == n){
                answer++;
                answer = answer*answer;
                break;
            }
            answer++;
            if(answer ==n){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}