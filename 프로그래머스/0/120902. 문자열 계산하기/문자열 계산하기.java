class Solution {
    public int solution(String my_string) {
        
        String [] sum = my_string.split(" ");
        int answer = Integer.parseInt(sum[0]);
        for(int i=0;i<sum.length;i++){
            if(sum[i].equals("+")){
                answer += Integer.parseInt(sum[i+1]);
            }else if(sum[i].equals("-")){
                answer -= Integer.parseInt(sum[i+1]);
            }
        }
        return answer;
    }
}