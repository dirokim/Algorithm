class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        int num = 0;
        int num2 = 0;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                num = arr1[i][j];
                num2 = arr2[i][j];
                answer[i][j]= num+num2;
            }
        }
        return answer;
    }
}