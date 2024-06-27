class Solution {
    public String[] solution(String my_str, int n) {
        int sum = my_str.length();
        int num = 0;
        if(sum%n==0){
            sum = sum/n;
        }else if(sum%n>0){
            sum = sum/n+1;
        }
        String [] answer = new String[sum];
        for(int i=0;i<sum;i++){
            num = n*i;
            if(i==sum-1) {
            	answer[i] = my_str.substring(num);
            }else {
            	answer[i] = my_str.substring(num,n+num);
            }
        }
        return answer;
    }
}