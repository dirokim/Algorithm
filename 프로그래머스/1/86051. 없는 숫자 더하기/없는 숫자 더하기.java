class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int check = 0;
        for(int i=0;i<=9;i++){
            check = 0;
            for(int j=0;j<numbers.length;j++){
                if(i==numbers[j]){
                    check ++;
                }
            }
            if(check == 0){
                answer += i;
            }
        }
        return answer;
    }
}