class Solution {
    public int[] solution(int n, int s) {
        if(n > s) return new int[] {-1};
        int[] answer = new int[n];
        int sum = 0;
        int num = 0;
        while(n > 0){
            num = s/n;
            answer[sum++] = num;
            s -= num;
            n--;
        }
        return answer;
    }
}