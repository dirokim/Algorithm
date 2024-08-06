class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a>b){
             answer = a;
             a = b;
             b = (int)answer;
             answer = 0;
        }
        for(int i=a;i<=b;i++){
            answer += i;
        }
        return answer;
    }
}