class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String sum = "";
        for(int i=0;i<=t.length()-p.length();i++){
            sum = t.substring(i,i+p.length());
            if(Long.parseLong(p) >= Long.parseLong(sum)){
                answer++;
            }
        }
        return answer;
    }
}