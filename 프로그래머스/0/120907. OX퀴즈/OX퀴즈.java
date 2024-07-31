class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0;i<quiz.length;i++){
            String [] sum = quiz[i].split(" ");
            int num1 = Integer.parseInt(sum[0]);
            int num2 = Integer.parseInt(sum[2]);
            if(sum[1].equals("-")){
                if((num1-num2)==Integer.parseInt(sum[4])){
                    answer[i]="O";
                }else{
                    answer[i]="X";
                }
            }else if(sum[1].equals("+")){
                if((num1+num2)==Integer.parseInt(sum[4])){
                    answer[i]="O";
                }else{
                    answer[i]="X";
                }
            }
        }
        return answer;
    }
}