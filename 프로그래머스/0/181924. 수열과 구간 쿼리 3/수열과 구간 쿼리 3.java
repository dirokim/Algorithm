class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        int temp = 0;
        int start = 0;
        int end = 0;
        for(int i=0;i<queries.length;i++){
            start = queries[i][0];
            end = queries[i][1];
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        answer = arr;
        return answer;
    }
}