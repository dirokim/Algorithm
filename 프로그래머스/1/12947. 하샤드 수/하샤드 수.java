class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String sum = ""+x;
        int num = 0;
        for(int i=0;i<sum.length();i++){
            num += Integer.parseInt(""+sum.charAt(i));
        }
        return answer = x%num == 0 ? true : false;
    }
}