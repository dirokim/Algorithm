class Solution {
    public int solution(int i, int j, int k) {
        String sum = "";
        String num = "";
        int answer = 0;
        for(int l=i;l<=j;l++){
            sum = ""+l;
            for(int m=0;m<sum.length();m++){
                num = ""+sum.charAt(m);
                if(num.contains(""+k)){
                    answer++;
                }else{
                    continue;
                }
            }
        }
        return answer;
    }
}