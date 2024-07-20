class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 1;
        for(int i=0;i<num_list.length;i++){
            answer += num_list[i];
            sum *= num_list[i];
        }
        answer *= answer;
        return answer = sum > answer ? 0 : 1;
    }
}