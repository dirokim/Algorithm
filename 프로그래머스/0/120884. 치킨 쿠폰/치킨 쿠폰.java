class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int num = chicken;
        int num2 = 0;
        while (num >= 10){
            num2 = num%10; //남은 쿠폰
            num = num/10;  //서비스 치킨
            answer += num;
            num += num2; 
        }
        return answer;
    }
}