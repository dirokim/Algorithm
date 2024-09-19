class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int middle = total/num;
        int start = total%num == 0 ? num/2 : num/2-1; 
        start = middle - start; 
        for(int i=0;i<num;i++){
            answer[i] = start;
            start++;
        }
        return answer;
    }
}