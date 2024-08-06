class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length()==6||s.length()==4){
            answer = true;
         for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                answer = false;
            }
        }   
        }
        return answer;
    }
}