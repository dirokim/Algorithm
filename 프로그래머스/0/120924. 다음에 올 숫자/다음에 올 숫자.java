class Solution {
    public int solution(int[] common) {
        int answer = 0; 
        if(common[2] == 0)return 0;
        int a = common[2]-common[1]; // 등차 수열
        int b = common[2]/common[1]; // 등비 수열 
        if(a==common[1]-common[0]){
            answer = common[common.length-1] + a;  
        }else if(b == common[1]/common[0]){
            answer = common[common.length-1] * b;
        }
        return answer;
    }
}