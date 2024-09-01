class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int num = 0;        //가로
        int num2 = 0;       //세로
        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]>sizes[i][1]){
                if(sizes[i][0] > num){
                    num = sizes[i][0];
                }
                if(sizes[i][1] > num2){
                    num2 = sizes[i][1];
                }
            }else{
                if(sizes[i][1] > num){
                    num = sizes[i][1];
                }
                if(sizes[i][0] > num2){
                    num2 = sizes[i][0];
                }
            }
        }
        return answer = num * num2;
    }
}