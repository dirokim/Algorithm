class Solution {
    public String solution(String s) {
        String answer = ""; 
        int chk = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                answer+=" ";
                chk = 0;
            }else if(s.charAt(i)!=' '){
                if(chk == 0){
                    chk++; 
                    answer += ""+Character.toUpperCase(s.charAt(i));
                }else if(chk > 0){
                    chk++; 
                    answer += ""+Character.toLowerCase(s.charAt(i));;
                }
            }
        }
        return answer;
    }
}