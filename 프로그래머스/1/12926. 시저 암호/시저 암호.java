class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int num = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) ==' '){
                answer += " ";
            }else{
                if(Character.isUpperCase(s.charAt(i))){
                    num = (int)s.charAt(i)+n;
                    if(num > 90){
                        num -= 26;
                    }
                    answer += (char)num;      
                }else{
                    num = (int)s.charAt(i)+n;
                    if(num > 122){
                        num -= 26;
                    }
                    answer += (char)num;
                }
            }
        }
        return answer;
    }
}