class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        for(int k=0;k<arr.length;k++){
            answer[k] = arr[k];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<queries.length;j++){
                if(i>=queries[j][0]&&i<=queries[j][1]){
                    answer[i] = answer[i]+1;
                }
            }
        }
        return answer;
    }
}