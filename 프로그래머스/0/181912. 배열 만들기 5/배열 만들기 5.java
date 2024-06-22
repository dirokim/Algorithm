class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        String sum = "";
        int num = 0;
        for(int i=0;i<intStrs.length;i++){
            num = Integer.parseInt(intStrs[i].substring(s,s+l));
           if(num>k){
               sum+=""+num+",";
           } 
        }
        String [] result = sum.split(",");
        int[] answer = new int[result.length];
        for(int j=0;j<result.length;j++){
            answer[j]=Integer.parseInt(result[j]);
        }
        return answer;
    }
}