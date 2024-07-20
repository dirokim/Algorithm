class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String [] sum = binomial.split(" ");
        int first = Integer.parseInt(sum[0]);
        int second = Integer.parseInt(sum[2]);
        if(sum[1].equals("+")){
            answer = first + second;
        }else if(sum[1].equals("-")){
            answer = first - second;
        }else if(sum[1].equals("*")){
            answer = first * second;
        }
        return answer;
    }
}