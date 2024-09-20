class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int num2 = denom1*denom2;
        int num = numer1*denom2 + numer2*denom1;
        int sum = num > num2 ? num : num2;
        boolean check = true;
        while (check){ 
            check = false;
         for(int i=2;i<sum;i++){
            if(num%i==0 && num2%i==0){
                num2 = num2 / i;
                num  = num / i;
                check = true;
                break;
            }
         }  
        }
        answer[0] = num;
        answer[1] = num2;
        return answer;
    }
}