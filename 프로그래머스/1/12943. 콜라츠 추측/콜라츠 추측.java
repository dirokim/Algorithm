class Solution {
    public int solution(int num) {
        int answer = 0;
        long sum = (long)num;
        while(sum>1){
            answer++;
            if(sum%2==0){
                sum = sum/2;
            }else if(sum%2==1){
                sum = sum*3+1;
            }
            if(sum==1){
                break;
            }
            if(answer>=500){
                answer=-1;
                break;
            }
        }
        return answer;
    }
}