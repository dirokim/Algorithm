class Solution {
    public String solution(String s) {
        String answer = "";
        String [] sum = s.split(" ",-1);
        String temp = "";
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[i].length();j++){
                temp = ""+sum[i].charAt(j);
                if(j%2==0){
                    answer += temp.toUpperCase();
                }else{
                    answer += temp.toLowerCase();
                }
            }
            if(i == sum.length-1) break;
            answer += " ";
        }
        return answer;
    }
}