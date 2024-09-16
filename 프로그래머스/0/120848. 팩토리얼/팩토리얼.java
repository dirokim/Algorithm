class Solution {
    public int solution(int n) {
        int answer = 1;
        int sum = 1; 
        boolean check = true;
        while(true){
            sum *= answer;
            if(sum > n){
                answer--;
                break;
            }
            answer++;
        }
        return answer;
    }
}