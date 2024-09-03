class Solution {
    public String solution(int[] food) {
        String answer = "";
        int num = -1;
        int sum = 0;
        for(int i=0;i<food.length;i++){
            num++;
            if(food[i] < 2){
            }else{
                if(food[i]%2==0){
                    sum = food[i]/2;
                    for(int j=0;j<sum;j++){
                        answer += ""+num;
                    }
                }else if(food[i]%2==1){
                    sum = food[i]-1;
                    sum = food[i]/2;
                    for(int j=0;j<sum;j++){
                        answer += ""+num;
                    }
                }
            }
        }
        answer += "0"+ new StringBuilder(answer).reverse();
        return answer;
    }
}