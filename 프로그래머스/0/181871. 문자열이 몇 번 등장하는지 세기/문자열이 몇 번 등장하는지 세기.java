class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String sum = "";
        for(int i=0;i<myString.length();i++){
            if(i==myString.length()-pat.length()+1){
                break;
            }
            sum = myString.substring(i,i+pat.length());
            if(pat.equals(sum)){
                answer++;
            }
        }
        return answer;
    }
}