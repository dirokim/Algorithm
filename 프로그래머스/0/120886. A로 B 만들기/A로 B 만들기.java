class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int sum = 0;
        int sum2= 0;
        for(int i=0;i<before.length();i++){
            sum += (int)before.charAt(i);
            sum2+= (int)after.charAt(i);
        }
        return answer = sum == sum2 ? 1:0;
    }
}